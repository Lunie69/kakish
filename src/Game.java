public class Game {
    public String name;
    private int playersOnline;
    private int playersMax;
    private int likes;

    public Game(String name, int playersOnline, int playersMax, int likes) {
        this.name = name;
        this.playersOnline = playersOnline;
        this.playersMax = playersMax;
        this.likes = likes;
    }
    public void display() {
        System.out.println("Name: " + name +
                ", Online: " + playersOnline +
                ", MaxOnline: " + playersMax +
                ", Likes: " + likes);
    }
}
