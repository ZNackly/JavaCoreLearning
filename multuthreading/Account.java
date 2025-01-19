public class Account {
    private int amount1;
    private int amount2;
    private final Object monitor1 = new Object();
    private final Object monitor2 = new Object();

    public Account(int ammount1, int ammount2) {
        this.amount1 = amount1;
        this.amount2 = amount2;
    }

    public void TransferFrom1To2(int sum) {
        synchronized (monitor1) {
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                // TODO: handle exception
            }
            if (amount1 >= sum) {
                synchronized (monitor2) {
                    try {
                        Thread.sleep(2000);
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                    amount1 -= sum;
                    amount2 += sum;
                }
            } else {
                System.out.println("Недостаточно средств");
            }
        }
    }

    public void TransferFrom2To1(int sum) {
        synchronized (monitor2) {
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                // TODO: handle exception
            }
            if (amount2 >= sum) {
                synchronized (monitor2) {
                    try {
                        Thread.sleep(2000);
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                    amount2 -= sum;
                    amount1 += sum;
                }
            } else {
                System.out.println("Недостаточно средств");
            }
        }
    }
}
