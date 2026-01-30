public class Economy extends Content {
    private int dollars;
    private int tenge;
    private int rubles;

    public Economy(String part, int dollars, int tenge, int rubles) {
        super(part);
        this.dollars = dollars;
        this.tenge = tenge;
        this.rubles = rubles;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Economy Part: " + getTitle() +
                ", USD: " + dollars +
                ", KZT: " + tenge +
                ", RUB: " + rubles;
    }
}
