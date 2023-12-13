package games_club_athos.api.games;

public record DadosListaGames(Long id, String nome, Consoles consoles, String img, int locado) {

    public DadosListaGames (Games games){
        this(games.getId(), games.getNome(), games.getConsoles(), games.getImg(),games.getLocado());
    }
}
