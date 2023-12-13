package games_club_athos.api.usuarios;

import games_club_athos.api.games.Games;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDto {
    private long id;
    private String nome;
    private String telefone;

    private Games games;


    public UsuarioDto(Usuarios usuarios) {
        this.id = usuarios.getId();
        this.nome = usuarios.getNome();
        this.telefone = usuarios.getTelefone();
        this.games = usuarios.getGames();
    }

    public static List<UsuarioDto> convert(List<Usuarios> usuarios){
        return usuarios.stream().map(UsuarioDto::new).collect(Collectors.toList());
    }
}
