package filedemo;

import java.io.File;
import java.io.IOException;

public class Main {
// /Users/mikaila/loopsraysandmore/src/main/resources
    public static void createFile() throws IOException {
        File file = new File("/Users/mikaila/loopsraysandmore/src/main/resources/test.txt");
        file.createNewFile();
    }
    public static void main(String[] args) {
        try {
            createFile();
        } catch (IOException ioException) {
            //ioException.printStackTrace();
            System.out.println("No such path or file exist");
        }
    }

}
