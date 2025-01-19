import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class Main7 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor(new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                final Thread thread = new Thread(r);
                thread.setDaemon(true);
                return thread;
            }
        });
        executorService.execute(new Runnable() {
            public void run() {
                long timer = 0;
                try {
                    while (true) {
                        timer++;
                        Thread.sleep(1000);
                        System.out.println(timer);
                    }
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        }

        );
        for (int i = 0; i <= 10; i++) {
            System.out.println("...");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        System.out.println("finish");
    }
}
