package interfaces;

public class Cat extends Animal implements AbleToRun {
    @Override
    public void eat() {
        System.out.println("Кошачий корм");
    }

    public void run() {
        System.out.println("Кот бежит");
    }
}