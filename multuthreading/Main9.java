
public class Main9 {
    public static void main(String[] args) {
        BlockingQueue blockingQueue = new BlockingQueue();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    Runnable task = blockingQueue.take();
                    if (task != null) {
                        new Thread(task).start();

                    }

                }
            }
        }).start();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            blockingQueue.add(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                    System.out.println("---" + index);
                }
            });
        }
    }
}
