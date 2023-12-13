package games_club_athos.api.games;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizarGames(
        @NotNull
        Long id,
        String nome,
        Consoles consoles,
        String img,
        int locado
) {
}
