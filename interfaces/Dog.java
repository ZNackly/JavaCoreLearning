package interfaces;

public class Dog extends Animal implements AbleToRun {
    @Override
    public void eat() {
        System.out.println("Собачий корм");
    }
}