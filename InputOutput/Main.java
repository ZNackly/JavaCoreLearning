import java.io.File;

public class Main {
    public static void main(String[] args) {
        File directory = new File("folder/folder2/folder1");
        File file = new File("folder/folder2/folder1/file1.txt");
        File file2 = new File("folder/folder2/folder1/file2.txt");
        File file3 = new File("folder/folder2/folder1/file3.txt");
        String[] names = directory.list();
        File[] files = directory.listFiles();
        try {
            directory.mkdirs();
            file.createNewFile();
            file2.createNewFile();
            file3.createNewFile();
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println(file.getName());
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        for (File f : files) {
            System.out.println(f);
        }
        for (String name : names) {
            System.out.println(name);
        }
    }
}