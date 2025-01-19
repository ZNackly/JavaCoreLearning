import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main5 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        CountDownLatch count = new CountDownLatch(10);
        for (int i = 1; i <= 10; i++) {
            final int index = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.printf("Thread " + index + "\n");
                    System.out.println("Start");

                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                    System.out.println("finish " + index);
                    count.countDown();

                }

            });
            try {
                count.await();
            } catch (Exception e) {
                // TODO: handle exception
            }
            System.out.println("All treads are terminated");
        }
    }
}