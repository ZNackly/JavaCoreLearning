// public class Main2 {
//     public static void main(String[] args) {
//         System.out.println("Start");
//         Thread thread = new MyThread();
//         thread.start();
//         for (int i = 1; i <= 1000; i++) {
//             System.out.print("M");
//         }
//         System.out.println("\nFinish");
//     }
// }

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Start");
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        for (int i = 1; i <= 1000; i++) {
            System.out.print("M");
        }
        for (int i = 1; i <= 1000; i++) {
            if (i == 100) {
                thread.interrupt();
            }
        }
        System.out.println("\nFinish");
    }
}

// public class Main2 {
// public static void main(String[] args) {
// System.out.println("Start");
// Thread thread = new Thread(new Runnable() {
// @Override
// public void run() {
// for (int i = 1; i <= 1000; i++) {
// System.out.print(i + " ");
// }
// }
// });
// thread.start();
// System.out.println("\nFinish");
// }
// }