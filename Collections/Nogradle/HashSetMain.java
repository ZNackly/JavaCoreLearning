import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

public class HashSetMain {
    public static void main(String[] args) {
        HashSet<String> CustomerCity = new HashSet<>();
        System.out.println(CustomerCity.size());
        Vector vector = new Vector<>();
        vector.add("Tyumen");
        vector.add("London");
        vector.add("Pekin");
        System.out.println(CustomerCity.isEmpty());
        CustomerCity.add("Tyumen");
        CustomerCity.add("Tyumen");
        CustomerCity.add("London");
        CustomerCity.add("Moscow");
        CustomerCity.add("Paris");
        CustomerCity.add("New York");
        System.out.println(CustomerCity);
        System.out.println(CustomerCity.isEmpty());
        System.out.println(CustomerCity.contains("Tyumen"));
        CustomerCity.addAll(vector);
        Object[] array = CustomerCity.toArray();
        for (Object obj : array) {
            System.out.print(obj + " ");
        }
        System.out.println();
        System.out.println(CustomerCity);
        System.out.println(CustomerCity.contains(vector));
        System.out.println(CustomerCity.size());
        CustomerCity.removeAll(vector);
        System.out.println(CustomerCity);
        CustomerCity.clear();
        System.out.println(CustomerCity);
        Iterator iterator = CustomerCity.iterator();
        for (String Customer : CustomerCity) {
            System.out.println(Customer);
        }

    }
}
