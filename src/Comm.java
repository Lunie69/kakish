public class Comm {
    private int negative_com;
    private int positive_com;
    private int mixed_com;
    private String topic;

    public Comm(String topic, int negative_com, int positive_com, int mixed_com) {
        this.negative_com = negative_com;
        this.positive_com = positive_com;
        this.mixed_com = mixed_com;
        this.topic = topic;
    }
    public void display() {
        System.out.println("Topic: " + topic +
                ", Positive: " + positive_com +
                ", Negative: " + negative_com +
                ", Mix: " + mixed_com);
    }
}
