package games_club_athos.api.usuarios;

import games_club_athos.api.games.Games;

import java.util.List;

public record DadosListarUsuario(Long id, String nome, String telefone, Games games) {
    public DadosListarUsuario(Usuarios usuarios) {
        this(usuarios.getId(),usuarios.getNome(),usuarios.getTelefone(),usuarios.getGames());
    }
}
