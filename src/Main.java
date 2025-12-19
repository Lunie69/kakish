import java.nio.file.StandardOpenOption;

public class Main {
    public static void main(String[] args) {
        Game g1 = new Game("Albion", 67999, 100000, 9999);
        Game g2 = new Game("SC:X", 34569, 150000, 55556);
        Game g3 = new Game("BrawlStars", 999, 1000, 15);

        Comm c1 = new Comm("GUIDE FoR NOOBies", 96, 50295, 5938);
        Comm c2 = new Comm("CoCo Secret", 48, 7777, 59);
        Comm c3 = new Comm("GUIDE FoR NOOBies", 66, 5295, 538);

        Economy e1 = new Economy("Spawn", 1000000, 500000000, 70000000);
        Economy e2 = new Economy("FanService", 582958, 5389000, 4760000);
        Economy e3 = new Economy("Donuts", 99999, 8884848, 4242141);

        g1.display();
        g2.display();
        g3.display();

        c1.display();
        c2.display();
        c3.display();

        e1.display();
        e2.display();
        e3.display();

        System.out.println();
    }
}
