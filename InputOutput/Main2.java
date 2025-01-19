import java.io.File;

public class Main2 {
    public static void main(String[] args) {
        File directory = new File("folder1/folder2/folder3");
        File file1 = new File("folder3/A1");
        File file2 = new File("folder3/B2");
        File file3 = new File("folder3/A3");
        try {
            directory.mkdirs();
            file1.createNewFile();
            file2.createNewFile();
            file3.createNewFile();
        } catch (Exception e) {
            // TODO: handle exception
        }
        File[] filtered = directory.listFiles((dir, name) -> name.startsWith("A"));
        for (File file : filtered) {
            System.out.println(file);
        }

    }
}
