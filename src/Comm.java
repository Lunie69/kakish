public class Comm extends Content {
    private int negative;
    private int positive;
    private int mixed;

    public Comm(String topic, int negative, int positive, int mixed) {
        super(topic);
        this.negative = negative;
        this.positive = positive;
        this.mixed = mixed;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Community Topic: " + getTitle() +
                ", Positive: " + positive +
                ", Negative: " + negative +
                ", Mixed: " + mixed;
    }
}
