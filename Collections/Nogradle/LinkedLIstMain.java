import java.util.Arrays;
import java.util.LinkedList;

public class LinkedLIstMain {
    public static void main(String[] args) {
        String str1 = "Hello ";
        String str2 = "I am ";
        String str3 = "from ";
        String str4 = "Tyumen";
        LinkedList<String> text = new LinkedList<>();
        text.add(str1);
        text.add(str2);
        text.add(str3);
        text.add(str4);
        text.add(3, "bobo ");
        System.out.println(text);
        text.remove(3);
        System.out.println(text);
        text.addFirst("Yo! ");
        text.addLast(" city");
        System.out.println(text.peekFirst());
        System.out.println(text.peekLast());
        System.out.println(text.pollFirst());
        System.out.println(text.pollLast());
        System.out.println(Arrays.toString(text.toArray()));
        System.out.println(text);
    }
}
