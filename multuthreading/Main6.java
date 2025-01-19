import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main6 {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        long before = System.currentTimeMillis();
        executorService.execute(new Runnable() {

            public void run() {
                int sum = 0;
                for (int i = 1; i < 1000000; i++) {
                    if (i % 2 == 0) {
                        sum += i;
                    }
                }
                System.out.println("sum: " + sum);
                countDownLatch.countDown();
            }
        });
        executorService.execute(new Runnable() {
            public void run() {
                int sum7 = 0;
                for (int i = 1; i < 1000000; i++) {
                    if (i % 7 == 0) {
                        sum7 += i;
                    }
                }
                System.out.println("sum7: " + sum7);
                countDownLatch.countDown();
            }
        });
        executorService.execute(new Runnable() {
            public void run() {
                Random random = new Random();
                ArrayList<Integer> array = new ArrayList<>(1000);
                int colr = 0;
                for (int i = 1; i <= 1000; i++) {
                    int a = random.nextInt(0, 1001);
                    array.add(a);
                    if (a % 2 == 0) {
                        colr++;
                    }
                }
                System.out.println("Colr: " + colr);
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            // TODO: handle exception
        }
        long after = System.currentTimeMillis();
        System.out.println(after - before);
        executorService.shutdown();
    }
}