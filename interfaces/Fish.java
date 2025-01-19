package interfaces;

public class Fish extends Animal implements AbleToRun {
    @Override
    public void eat() {
        System.out.println("Рыбий корм");
    }
}