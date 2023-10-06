package maincollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void printStudentMap(Map<Integer, Student> studentRecords){

        for (Map.Entry<Integer, Student> student: studentRecords.entrySet()) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {

        // List - ArrayList
        List<Student> students = new ArrayList<>();
        Student s1 = new Student("Wesley Snipes");
        students.add(s1);        students.add( new Student("James bond"));        students.add( new Student("Jamie Jones"));
        students.add( new Student("Marc Jones"));

        for (Student student: students) {
            System.out.println(student);
        }

        System.out.println(students.size());



        // Map - HashMap
        Map<Integer, Student> studentRecords = new HashMap<>();
        studentRecords.put(7, s1);
        studentRecords.put(57, students.get(1));

        printStudentMap(studentRecords);


        // Set - HashSet

    }

}
