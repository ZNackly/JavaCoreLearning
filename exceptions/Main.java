package exceptions;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        try {
            System.out.println(array[10]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Неверный код, вы получили исключение: " + e.getClass());
        }
    }
}
