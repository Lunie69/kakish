import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Content> contents = new ArrayList<>();

        contents.add(new Game("Albion", 67999, 100000, 9999));
        contents.add(new Game("SC:X", 34569, 150000, 55556));
        contents.add(new Game("BrawlStars", 999, 1000, 15));

        contents.add(new Comm("GUIDE For Noobies", 96, 50295, 5938));
        contents.add(new Comm("CoCo Secret", 48, 7777, 59));

        contents.add(new Economy("Spawn", 1000000, 500000000, 70000000));
        contents.add(new Economy("Donuts", 99999, 8884848, 4242141));

        //Polymorphism
        for (Content c : contents) {
            c.display();
        }

        //Search
        System.out.println("\nSearch result:");
        contents.stream()
                .filter(c -> c.getTitle().equalsIgnoreCase("Albion"))
                .forEach(System.out::println);

        //Sorting
        contents.sort(Comparator.comparing(Content::getTitle));
    }
}
