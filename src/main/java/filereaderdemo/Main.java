package filereaderdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//Finally -
public class Main {
    public static void main(String[] args) {
        //read the contents of the file

        //FINALLY

//        File file = new File("/Users/mikaila/loopsraysandmore/src/main/resources/test.txt");
//        Scanner scanner = null;
//
//        try {
//            scanner = new Scanner(file);
//            while(scanner.hasNext()){
//                System.out.println(scanner.next());
//            }
//        } catch (FileNotFoundException fileNotFoundException) {
//            System.out.println("File not found homie");
//            fileNotFoundException.printStackTrace();
//        }finally{
//            assert scanner != null;
//            scanner.close();
//        }


        //TRY WITH RESOURCES

        File file = new File("/Users/mikaila/loopsraysandmore/src/main/resources/test.txt");

        try( Scanner scanner  = new Scanner(file) ){

            while(scanner.hasNext()){
                System.out.println(scanner.next());
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File not found homie");
            fileNotFoundException.printStackTrace();
        }



    }
}
