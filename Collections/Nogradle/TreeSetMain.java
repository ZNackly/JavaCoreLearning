import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetMain {
    public static void main(String[] args) {
        TreeSet letters = new TreeSet<>(Comparator.reverseOrder());
        letters.add('A');
        letters.add('B');
        letters.add('C');
        letters.add('D');
        System.out.println(letters);
        Iterator iterator = letters.iterator();
        for (Object letter : letters) {
            if (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
        TreeSet<String> subset = new TreeSet<>(letters.subSet("B", "D"));
        TreeSet<String> tailSet = new TreeSet<>(letters.tailSet("B"));
        TreeSet<String> HeadSet = new TreeSet<>(letters.headSet("C"));
        System.out.println(subset);
        System.out.println(tailSet);
        System.out.println(HeadSet);

    }
}
