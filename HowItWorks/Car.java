@FunctionalInterface
public interface Car {
    public void go();

    public default void stop() {
        System.out.println("Car stopped");
    }
}