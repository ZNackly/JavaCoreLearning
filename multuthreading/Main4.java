import java.util.ArrayList;

public class Main4 {
    public static void main(String[] args) {
        ArrayList<Thread> array = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            final int index = i;
            Thread thread = new Thread(new Runnable() {
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
                }

            });
            thread.start();
            array.add(thread);
        }
        for (Thread thread : array) {
            try {
                thread.join();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        System.out.println("Finish All");
    }
}
