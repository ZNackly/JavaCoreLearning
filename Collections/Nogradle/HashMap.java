import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<String, String> initials = new java.util.HashMap<>();
        initials.put("Johnson", "John");
        initials.put("Smirnov", "Petr");
        initials.put("Karabanov", "John");
        initials.put("Li", null);
        Map<String, String> initials2 = initials;
        System.out.println(initials.containsKey("Johnson"));
        System.out.println(initials.containsValue("John"));
        System.out.println(initials.entrySet());
        System.out.println(initials.equals(initials2));
        System.out.println(initials.isEmpty());
        System.out.println(initials.get("Li"));
        initials.replace("Karabanov", null);
        for (Map.Entry<String, String> item : initials.entrySet()) {
            if (item.getValue() != null) {
                System.out.printf("Человека по фамилии %s, зовут %s.\n", item.getKey(), item.getValue());
            } else {
                System.out.printf("Человек по фамилии %s, не имеет имени.\n", item.getKey());
            }

        }

    }
}
