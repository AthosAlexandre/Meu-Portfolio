package games_club_athos.api.games;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GamesDto {
    private Long id;
    private String nome;
    private Consoles consoles;
    private String img;
    private int locado;
    public GamesDto(Games games) {
        this.id = games.getId();
        this.nome = games.getNome();
        this.consoles = games.getConsoles();
        this.img = games.getImg();
        this.locado = games.getLocado();
    }
}
