import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Alex", 35));
        users.add(new User("Max", 22));
        users.add(new User("John", 17));
        users.add(new User("Andrew", 33));
        users.add(new User("Jack", 44));
        users.add(new User("Nick", 80));
        users.add(new User("Alice", 46));
        users.add(new User("Helen", 11));
        // long count = users.stream()
        // .filter(user -> user.getAge() > 30)
        // .count();

        // boolean CanWeGo = users.stream()
        // .anyMatch(user -> user.getAge() > 18);
        List<User> array = users.stream()
                .sorted((o1, o2) -> Integer.compare(o2.getAge(), o1.getAge()))
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(array);

        // boolean CanWeGo = users.stream()
        // .allMatch(user -> user.getAge() > 18);

        // System.out.println(count);
        // System.out.println(CanWeGo);
    }
}
