public class Main3 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                counter.inc();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                counter.dec();
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println(counter.getCounter());

    }
}
