package fakenews;

import java.util.*;

public class Main {
    public static void main(String[] args) {

    ArrayList<Person> folks = new ArrayList<>();

    folks.add(new Person("zane", 98));
    folks.add(new Person("jack", 9));
    folks.add(new Person("mary", 7));

      //Collections.sort(folks);

        Comparator<Person> nameComparator = new NameComparator();
        Collections.sort(folks, nameComparator);


        for (Person x : folks) {
            System.out.println(x);
        }

        System.out.println("=====");

        Comparator<Person> ageComparator = new AgeComparator();
        Collections.sort(folks, ageComparator);

        for (Person x : folks) {
            System.out.println(x);
        }

        //jack
        //mary
        //zane




//        for (Map.Entry<Integer, String> i : studentsRanking.entrySet()) {
//            System.out.println(i);
//        }

        //Google how to loop through a map with an iterator






//        Iterator<Double> doubleIterator = numbers.iterator();
//        while(doubleIterator.hasNext()){
//            System.out.println(doubleIterator.next());
//        }




        //create an iterator object
//        Iterator<Person> iterator = people.iterator();
//
//        while(iterator.hasNext()){
//            Person pDiddy = iterator.next();
//            if(pDiddy.getName().equalsIgnoreCase("Ol dirty bastard")){
//                iterator.remove();
//                continue;
//            }
////            iterator.remove();
//            System.out.println(pDiddy.getName());
//        }

        //print name of each person
//        for ( Person p : people ) {
//            System.out.println(p.getName());
//        }











//        ArrayList<String> studentList = new ArrayList();
//        studentList.add("Mikaila");
//        studentList.add("Mary");
//        studentList.add("Tyrone");
//
//        for (String student: studentList ) {
//            System.out.println(student);
//        }
//
//        System.out.println(studentList);




//        Person p1 = new Entrepreneur("Mikaila", 5000.00, 25000.00);
//        //p1.printName();
//        System.out.println(p1 instanceof Employee);
//
//        //Reassigned - Mikaila is now an Employee
//        p1 = new Employee("Tanya", 40); //Upcasting
//         // true or false
//
//        //p1.printName();
//
//        //((Employee)p1).calculatePay(); // Downcast - Manually








    }
}
