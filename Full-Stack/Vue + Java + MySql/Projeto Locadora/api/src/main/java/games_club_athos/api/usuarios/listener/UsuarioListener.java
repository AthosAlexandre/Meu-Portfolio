package games_club_athos.api.usuarios.listener;

import games_club_athos.api.games.Games;
import games_club_athos.api.games.GamesRepository;
import games_club_athos.api.usuarios.Usuarios;
import jakarta.persistence.PostLoad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UsuarioListener {
    private static GamesRepository gamesRepository;

    @Autowired
    public void init(GamesRepository repository) {
        gamesRepository = repository;
    }


}
