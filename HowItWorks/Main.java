public class Main {
    public static void main(String[] args) {
        Car car = new Car() {
            @Override
            public void go() {
                System.out.println("Car is going....Beep Beep");
            }
        };
        car.go();
        car.stop();
    }

}
