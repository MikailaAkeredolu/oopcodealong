package except;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Unchecked - developer fault, logical error
        // Checked - file not found, server is down db

        //Create an array with 3 elements
        //print element element at 4th index


        /*
        Try - what you want to do that is risky
        Catch - handle things
         */

        //Try to use a scanner to ask for 2 numbers then divide the first by the second
        // but the second input should be zero

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a numerator");
        int numerator = scanner.nextInt();

        System.out.println("Give a denominator");
        int denominator = scanner.nextInt();

        int result = numerator / denominator;

        System.out.println(result);






    }
}
