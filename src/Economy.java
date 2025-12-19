public class Economy {
    public String part;
    private int dollars;
    private int tenge;
    private int rubles;

    public Economy(String part, int dollars, int tenge, int rubles) {
        this.part = part;
        this.dollars = dollars;
        this.tenge = tenge;
        this.rubles = rubles;
    }
    public void display() {
        System.out.println("Part: " + part +
                ", DOLLAR: " + dollars +
                ", TG: " + tenge +
                ", RUB: " + rubles);
    }
}
