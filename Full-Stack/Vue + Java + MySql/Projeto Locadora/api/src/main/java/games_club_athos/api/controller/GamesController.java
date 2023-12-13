package games_club_athos.api.controller;

import games_club_athos.api.games.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/games")
@CrossOrigin("http://localhost:3000") // Serve para  o front-end conseguir acessar a API
public class GamesController {
    @Autowired
    private GamesRepository gamesRepository;

    @PostMapping
    @Transactional
    public void cadastrarGames(@RequestBody @Valid Games games){

        gamesRepository.save(games);
    }

    @GetMapping
    public Page<DadosListaGames> listarGames(Pageable paginacao){
        return gamesRepository.findAll(paginacao).map(DadosListaGames::new);
    }

    @PutMapping
    @Transactional
   public void atualizarGames(@RequestBody @Valid DadosAtualizarGames dados){
        var games = gamesRepository.getReferenceById(dados.id());
        games.atualizarGame(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluirGame(@PathVariable Long id){
        gamesRepository.deleteById(id);
    }
}
