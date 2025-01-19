import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main11 {
    public static void main(String[] args) {
        Account account = new Account(1000, 1000);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new Runnable() {
            public void run() {
                account.TransferFrom1To2(300);
            }
        });
        executorService.execute(new Runnable() {
            public void run() {
                account.TransferFrom2To1(500);
            }
        });

    }
}
