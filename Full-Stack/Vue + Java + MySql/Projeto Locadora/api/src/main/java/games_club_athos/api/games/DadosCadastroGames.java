package games_club_athos.api.games;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroGames(
        @NotBlank
        String nome,
        @NotNull
        Consoles consoles,
        @NotNull
        String img,
        @NotNull
        int locado
) {
}
