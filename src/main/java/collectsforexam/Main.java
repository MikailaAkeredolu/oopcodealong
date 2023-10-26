package collectsforexam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {


        //Create an array list of numbers - Integers
        List<Integer> listOfNumbers = new ArrayList<>();
        //10, 100, 1
        listOfNumbers.add(10);
        listOfNumbers.add(100);
        listOfNumbers.add(1);

//        for(Integer x : listOfNumbers){
//            if(x % 2 ==  0){
//                listOfNumbers.remove(x);
//            }else{
//                System.out.println(x);
//            }
//        }

        //while loop + Iterator - odd numbers
 //       Iterator<Integer> it = listOfNumbers.iterator();
//        while(it.hasNext()){
//            Integer number = it.next();  //
//            if(number % 2 == 0){
//                it.remove();
//                //continue;
//            }
//
//        }

        ListIterator<Integer> it = listOfNumbers.listIterator(listOfNumbers.size());
        while(it.hasPrevious()){
           // Integer number = it.next();  //
            System.out.println("--");
            System.out.println(it.previous());
        }

        System.out.println();

        ListIterator<Integer> its = listOfNumbers.listIterator();
        while(its.hasNext()){
            System.out.println(its.next());


        }


        //Create an array list of numbers - Integers
        ArrayList<String> listOfNames = new ArrayList<>();
        //10, 100, 1
        listOfNames.add("Hakeem");
        listOfNames.add("Aliyah");
        listOfNames.add("Tobi");


        ListIterator<String> n = listOfNames.listIterator(listOfNames.size());
        while(n.hasPrevious()){
            // Integer number = it.next();  //
            System.out.println(n.previous());
        }




        //Create another for each loop to print ONLY even numbers
        //Create another for each loop to print ONLY odd numbers
        // - if this is NOT possible then use a ListIterator
        //Using a listIterator - print the number sin REVERSE



    }
}
