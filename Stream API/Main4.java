
import java.util.ArrayList;
import java.util.Optional;
public class Main4 {
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
        Optional<User> oldest = users.stream()
                .max((o1, o2) -> Integer.compare(o1.getAge(), o2.getAge()));
        System.out.println((oldest.get()));
    }
}
