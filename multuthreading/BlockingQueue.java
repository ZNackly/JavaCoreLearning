import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {
    Object maonitor = new Object();
    Queue<Runnable> rQueue = new LinkedList<>();

    public void add(Runnable task) {
        synchronized (maonitor) {
            rQueue.add(task);
        }
    }

    public Runnable take() {

        synchronized (maonitor) {
            return rQueue.poll();
        }
    }
}
