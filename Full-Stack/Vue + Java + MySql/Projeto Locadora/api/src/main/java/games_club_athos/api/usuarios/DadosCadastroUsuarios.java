package games_club_athos.api.usuarios;

import games_club_athos.api.games.Games;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

public record DadosCadastroUsuarios(
        @NotBlank
        String nome,
        @NotBlank
        String telefone,

       Games games
) {
}
