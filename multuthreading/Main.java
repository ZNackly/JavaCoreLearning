import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    l1.add(i);
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread1.join();
                } catch (Exception e) {
                    // TODO: handle exception
                }
                for (int i = 0; i < 100; i++) {
                    l2.add(i);
                }
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread2.join();
                } catch (Exception e) {
                    // TODO: handle exception
                }
                for (int i = 0; i < 100; i++) {
                    l3.add(i);
                }
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
        try {
            thread3.join();
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println(l1.size());
        System.out.println(l2.size());
        System.out.println(l3.size());

    }
}
