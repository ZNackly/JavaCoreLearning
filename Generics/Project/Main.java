import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Box<Integer, String, String> box = new Box<>(15, "John", "Name");
        System.out.println(box.getKey());
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        ArrayList<Integer> lst2 = new ArrayList<>();
        lst2.add(4);
        lst2.add(5);
        lst2.add(6);
        Box.transfer(lst, lst2);
    }
}
