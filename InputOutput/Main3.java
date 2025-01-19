import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Main3 {
    public static void main(String[] args) {
        File file = new File("1.txt");
        try {
            file.createNewFile();
        } catch (Exception e) {
            // TODO: handle exception
        }
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
            int a = inputStream.read();
            while (a != -1) {
                System.out.print((char) a);
                a = inputStream.read();
            }
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        }
    }
}
