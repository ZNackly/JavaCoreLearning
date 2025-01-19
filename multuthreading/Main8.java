import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;

public class Main8 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2, new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread myThread = new Thread();
                myThread.setDaemon(true);
                return myThread;
            }
        });
        Future<String> futureName = executorService.submit(new Callable<String>() {
            @Override
            public String call() {
                try {
                    Thread.sleep(5000);
                } catch (Exception e) {
                    // TODO: handle exception
                }
                return "John";
            }
        });
        try {
            String name = futureName.get();
            System.out.println(name);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
