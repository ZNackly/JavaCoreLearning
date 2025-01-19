package interfaces;

public class Bird extends Animal implements AbleToRun {
    @Override
    public void eat() {
        System.out.println("Птичий корм");
    }
}