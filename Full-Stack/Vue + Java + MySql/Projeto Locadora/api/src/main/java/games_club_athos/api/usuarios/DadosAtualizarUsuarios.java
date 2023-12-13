package games_club_athos.api.usuarios;

import games_club_athos.api.games.Games;
import jakarta.validation.constraints.NotNull;

import java.util.List;


public record DadosAtualizarUsuarios(
        @NotNull
        Long id,
        String nome,
        String telefone,
        Games games
) {
}
