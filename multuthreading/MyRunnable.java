// public class MyThread extends Thread {
//     @Override
//     public void run() {
//         for (int i = 1; i <= 1000; i++) {
//             System.out.print(i + " ");
//         }
//     }
// }
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.print(i + " ");
            if (Thread.currentThread().isInterrupted()) {
                break;
            }
        }
    }
}