import java.util.ArrayList;

public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>(5);
        array.add("Hello");
        array.add("Privet");
        array.add("hi");
        array.add(3, "four");
        array.add(4, "five");
        System.out.println("Начальный массив " + array);
        ArrayList<String> array2 = (ArrayList<String>) array.clone();
        System.out.println(array2);
        System.out.println(array2.contains("Privet"));
        array2.ensureCapacity(7);
        System.out.println(array.size());
        System.out.println(array2.size());
        System.out.println(array.get(4));
        array2.add("s");
        System.out.println(array);
        System.out.println(array2);
        System.out.println(array.isEmpty());
    }
}