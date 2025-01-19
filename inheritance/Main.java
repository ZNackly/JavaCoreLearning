package inheritance;

public class Main {
    public static void main(String[] args) {
        // Cat cat = new Cat();
        // Lion lion = new Lion();
        // System.out.println(cat.canEatPerson);
        // System.out.println(lion.canEatPerson);
        Rect rect = new Rect(10, 20);
        triangle triangle = new triangle(20, 20, 30);
        System.out.println(rect.perimeter());
        System.out.println(triangle.perimeter());
    }
}
