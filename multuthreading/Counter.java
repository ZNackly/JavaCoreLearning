import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

    private AtomicInteger counter;

    public void inc() {
        counter.getAndIncrement();

    }

    public void dec() {

        counter.getAndDecrement();

    }

    public int getCounter() {
        return counter.intValue();
    }
}
