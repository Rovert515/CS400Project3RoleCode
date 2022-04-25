import java.util.List;

public class shortestPathApp {

    public static void main(String[] args) throws Exception {
        IShortestPathLoader loader = new shortestPathLoader(); //new shortestPathLoader();
        List<City> Cities = loader.loadShortestPath("cities.txt");
        GameSearcherBackend backend = new GameSearcherBackend(); //new ShowSearcherBackend();
        for(Game game : gameList) {
            backend.addGame(game);
        }
        IGameSearcherFrontend frontend = new GameSearcherFrontend(backend); //new ShowSearcherFrontend(backend);
        frontend.runCommandLoop();
    }
}