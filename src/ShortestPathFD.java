import java.util.*;

public class ShortestPathFD implements IShortestPathFD {

    //private final CityDistanceBD backend;
    private String input;
    private int num;
    private final Scanner scnr;
    private List<String> availableCities;
    private int rating;

    public ShortestPathFD(CityDistanceBD backend) {
        scnr = new Scanner(System.in);
    }


    @Override
    public void runCommandLoop() {
        System.out.println("Welcome to the Game Searcher App!\n=================================");
        boolean running = true;
        do {
            displayCommandMenu();
            switch (scnr.next()) {
                case "a":
                case "1":
                    try {
                        listCities();
                    } catch (Exception e) {
                        System.out.println("can't list the cities, sorry m8");
                    }
                    break;
                case "c":
                case "2":
                    try {
                        addCities(city1, city2); //TODO implement method
                    } catch (Exception e) {
                        System.out.println("That city isn't here dude");
                    }
                    break;
                case "p":
                case "3":
                    try {
                        getPathCities(); // backend's job, not mine
                    } catch (Exception e) {
                        System.out.println("Wishlist empty.");
                    }
                    break;
                case "q":
                case "4":
                    System.out.println("Thanks for using our app!");
                    running = false;
                    break;
                default:
                    displayCommandMenu();
                    break;
            }
        } while (running);
    }


    @Override
    public void displayCommandMenu() {
        System.out.println("Command Menu:\n1) [A]vailable cities\n2) [C]hoose an origin and destination city\n" +
                "3) [P]rint the shortest distance between cities\n4) [Q]uit");

    }

    // call method to read txt file --> or print all cities manually
    @Override
    public List<String> listCities() {
        List<String> listCities = new ArrayList<>();
        listCities.add(1, "Chicago");
        listCities.add(2, "New York");

        return listCities;

    }

    // need to work on placeholder class for backend to see how cities are being added
    @Override
    public int addCities(int city1, int city2) {
        return 0;
    }

    @Override
    public List<String> citiesBetween() {
        return null;
    }

    @Override
    public List<String> highwayNames() {
        return null;
    }
}