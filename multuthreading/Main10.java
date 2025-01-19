
public class Main10 {
    public static void main(String[] args) {
        final Object monitor = new Object();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (monitor) {
                    for (int i = 0; i < 5; i++) {
                        System.out.print("A");
                        try {
                            monitor.wait();
                            monitor.notifyAll();
                        } catch (Exception e) {
                            // TODO: handle exception
                        }
                    }
                }

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (monitor) {
                    for (int i = 0; i < 5; i++) {
                        System.out.print("B");
                        try {
                            monitor.wait();
                            monitor.notifyAll();
                        } catch (Exception e) {
                            // TODO: handle exception
                        }
                    }
                }

            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (monitor) {
                    for (int i = 0; i < 5; i++) {
                        System.out.print("C");
                        try {
                            monitor.wait();
                            monitor.notifyAll();
                        } catch (Exception e) {
                            // TODO: handle exception
                        }
                    }
                }

            }
        }).start();

    }
}
