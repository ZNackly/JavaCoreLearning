import java.util.PriorityQueue;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>(2);
        queue.offer("Alice");
        queue.offer("Bob");
        queue.add("Charlie");
        System.out.println(queue);

    }
}
