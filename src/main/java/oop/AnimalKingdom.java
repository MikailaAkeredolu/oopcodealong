package oop;

import java.util.Scanner;

public class AnimalKingdom {
    public static void main(String[] args) {




        Cat cat = new Cat("Fish");
//        System.out.println(cat);
//        cat.printAnimalFood("This is a cat and it eats");



        Dog dog = new Dog("Bones");
//        System.out.println(dog);
//        dog.printAnimalFood("This is a dog and it eats");

        RoboDog roboDog = new RoboDog();

        Lion lion = new Lion("People");

        //Lion lion1 = new Lion("peps",8);




        //An array of Pet objects -
        IPet[] pets = {cat, dog, roboDog};

        //For loop
//        for(int x = 0; x < pets.length; x++  ){
//               pets[x].greetOwner();
//        }

        //ForEach loop or Enhanced For loop

        for(IPet p : pets ){
            System.out.println(p);  // string reprentation of an object
            System.out.println("============");
           // p.greetOwner();
        }





    }
}


/*
 id: location in memory on the heap
 state: ivars, properties, attributes
 method/ behavior
 */