package games_club_athos.api.usuarios;

import games_club_athos.api.games.Games;
import games_club_athos.api.games.GamesRepository;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "usuarios")
@Entity()
@Data
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;

    @Size(max = 10)
    private String telefone;


    @ManyToOne()// um usuario pode ter varios games
    @JoinTable(name = "usuarios_games",
            joinColumns = @JoinColumn(name = "usuarios_id"),
            inverseJoinColumns = @JoinColumn(name = "games_id"))

    private Games games;

    public void atualizarUsuarios(UsuarioDto dados) {
        if (dados.getNome() != null) {
            this.nome = dados.getNome();
        }
        if (dados.getTelefone() != null) {
            this.telefone = dados.getTelefone();
        }
        if (dados.getGames() != null || (this.games != null && dados.getGames() == null)) {
            this.games = dados.getGames();
        }

    }

}
