import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadFactory;

public class Main12 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Semaphore semaphore = new Semaphore(3);
        for (int i = 0; i < 10; i++) {
            executorService.execute(new Runnable() {
                public void run() {
                    String name = Thread.currentThread().getName();
                    System.out.println(name + " started working");
                    try {
                        Thread.sleep(500);
                        semaphore.acquire();
                        workWithFileSystem();
                    } catch (Exception e) {
                        // TODO: handle exception
                    } finally {
                        semaphore.release();
                    }

                    System.out.println(name + " finished working");
                }
            });

        }
        executorService.shutdown();
    }

    private static void workWithFileSystem() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " started working with file system");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            // TODO: handle exception
        }

        System.out.println(name + " finished working with file system");

    }

}