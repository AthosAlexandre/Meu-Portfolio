package games_club_athos.api.controller;

import games_club_athos.api.games.Games;
import games_club_athos.api.games.GamesRepository;
import games_club_athos.api.usuarios.*;
import games_club_athos.api.usuarios.listener.UsuarioListener;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/usuarios")
@CrossOrigin("http://localhost:3000")
public class UsuariosController {
    @Autowired
    private UsuariosRepository respository;
    @Autowired
    private GamesRepository gamesRepository;

    @PostMapping
    @Transactional
    public void cadastrarUsuaario(@RequestBody @Valid Usuarios usuarios){
        respository.save(usuarios);
    }
    @GetMapping
    public Page<DadosListarUsuario> listarUsuarios (Pageable paginacao){
       return respository.findAll(paginacao).map(DadosListarUsuario::new);
    }

    @GetMapping("/{usuarioId}")
    public ResponseEntity<UsuarioDto> listarUsuarios(@PathVariable Long usuarioId){
        Optional<Usuarios>  usuarios = respository.findById(usuarioId);
        if(usuarios.isPresent()){
            return ResponseEntity.ok(new UsuarioDto(usuarios.get()));
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping
    @Transactional
    public ResponseEntity<Object> atualizarUsuario(@RequestBody @Valid UsuarioDto dados) {
        Optional<Usuarios> usuarioOptional = respository.findById(dados.getId());

        if (!usuarioOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found.");
        }

        Usuarios usuario = usuarioOptional.get();
        usuario.atualizarUsuarios(dados);

        // Verifique se o ID do game fornecido em UsuarioDto não é nulo
        if (dados.getGames() != null && dados.getGames().getId() != null) {
            Optional<Games> gameOptional = gamesRepository.findById(dados.getGames().getId());

            if (gameOptional.isPresent()) {
                usuario.setGames(gameOptional.get());
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Game not found.");
            }
        }

        return ResponseEntity.status(HttpStatus.OK).body(respository.save(usuario));
    }

    @DeleteMapping("/id")
    @Transactional
    public void excluirUsuarios(@PathVariable Long id){
        respository.deleteById(id);
    }

}