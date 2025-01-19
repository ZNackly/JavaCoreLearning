import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add((int) (Math.random() * 1000));
        }
        List<String> list = numbers.stream()
                .filter((n) -> n % 2 == 0)
                .map((n) -> "Number: " + Integer.toString(n))
                .filter((string) -> string.endsWith("0"))
                .map((n) -> n + "!")
                .collect(Collectors.toList());
        // ArrayList<Integer> filtered = filter(numbers, (n) -> n % 2 == 0);
        // System.out.println(filtered);
        // ArrayList<String> stringified = stringify(filtered);
        // System.out.println(stringified);
        for (String i : list) {
            System.out.println(i);
        }
    }

    private static ArrayList<Integer> filter(ArrayList<Integer> array, Predicate predicate) {
        ArrayList<Integer> array2 = new ArrayList<>();
        for (Integer number : array) {
            if (predicate.test(number)) {
                array2.add(number);
            }
        }
        return array2;
    }

    private static ArrayList<String> stringify(ArrayList<Integer> array) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (Integer number : array) {
            arrayList.add("Number: " + Integer.toString(number));
        }
        return arrayList;
    }
}
