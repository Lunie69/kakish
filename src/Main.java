import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //ASSIGNMENT-2

        ArrayList<Content> contents = new ArrayList<>();

        contents.add(new Game("Albion", 67999, 100000, 9999));
        contents.add(new Game("SC:X", 34569, 150000, 55556));
        contents.add(new Game("BrawlStars", 999, 1000, 15));

        contents.add(new Comm("GUIDE For Noobies", 96, 50295, 5938));
        contents.add(new Comm("CoCo Secret", 48, 7777, 59));

        contents.add(new Economy("Spawn", 1000000, 500000000, 70000000));
        contents.add(new Economy("Donuts", 99999, 8884848, 4242141));

        // Polymorphism demonstration
        System.out.println("=== ASSIGNMENT 2: Polymorphism ===");
        for (Content c : contents) {
            c.display();
        }

        // Search
        System.out.println("\n=== Search result ===");
        contents.stream()
                .filter(c -> c.getTitle().equalsIgnoreCase("Albion"))
                .forEach(System.out::println);

        // Sorting
        contents.sort(Comparator.comparing(Content::getTitle));
        System.out.println("\n=== Sorted by title ===");
        contents.forEach(System.out::println);


        //ASSIGNMENT-3

        System.out.println("\n=== ASSIGNMENT 3: Database operations ===");

        GameDAO dao = new GameDAO();

        try {
//create
            Game dbGame = new Game("Albion", 70000, 100000, 12000);
            dao.addGame(dbGame);
            System.out.println("Game added to database");
//update
            dao.updateLikes("Albion", 15000);
            System.out.println("Game updated in database");
//read
            List<Game> gamesFromDb = dao.getAllGames();
            System.out.println("\nGames from database:");
            for (Game g : gamesFromDb) {
                System.out.println(g);
            }
//del
            dao.deleteGame("Albion");
            System.out.println("\nGame deleted from database");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
