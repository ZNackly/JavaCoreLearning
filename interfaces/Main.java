package interfaces;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Cat cat = new Cat();
        // Dog dog = new Dog();
        // Bird bird = new Bird();
        // Fish fish = new Fish();
        // ArrayList<Animal> animals = new ArrayList<>();
        // animals.add(cat);
        // animals.add(dog);
        // animals.add(bird);
        // animals.add(fish);
        // for (Animal animal : animals) {
        // animal.eat();
        Random random = new Random();
        for (int i = 0; i < 10; i++)
            System.out.print(random.nextInt(5, 11) + " ");
    }
}
