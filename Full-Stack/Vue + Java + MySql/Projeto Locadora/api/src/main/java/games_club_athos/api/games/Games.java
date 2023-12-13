package games_club_athos.api.games;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Table(name = "games")
@Entity()
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Games {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @Enumerated(EnumType.STRING)
    private Consoles consoles;

    private String img;
    private int locado;

    public void atualizarGame(DadosAtualizarGames dados) {

        if (dados.nome() != null) {
            this.nome = dados.nome();
        }
        if (dados.consoles() != null) {
            this.consoles = dados.consoles();
        }
        if (dados.img() != null) {
            this.img = dados.img();
        }

        if ((dados.locado() == 0) || (dados.locado() == 1)) {
            this.locado = dados.locado();
        }

    }
}
