import java.util.concurrent.atomic.AtomicBoolean;

public class Number {
    private int number;
    AtomicBoolean processed = new AtomicBoolean(false);

    public Number(int number) {
        this.number = number;
    }

    public void setProcessed(AtomicBoolean processed) {
        this.processed = processed;
    }

    public int getNumber() {
        return number;
    }

    public void increment() {
        number++;
        processed.set(false);
    }
}
