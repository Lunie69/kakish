public class Game extends Content {
    private int playersOnline;
    private int playersMax;
    private int likes;

    public Game(String name, int playersOnline, int playersMax, int likes) {
        super(name);
        this.playersOnline = playersOnline;
        this.playersMax = playersMax;
        this.likes = likes;
    }

    public int getPlayersOnline() {
        return playersOnline;
    }

    public int getPlayersMax() {
        return playersMax;
    }

    public int getLikes() {
        return likes;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Game: " + getTitle() +
                ", Online: " + playersOnline +
                ", Max: " + playersMax +
                ", Likes: " + likes;
    }
}
