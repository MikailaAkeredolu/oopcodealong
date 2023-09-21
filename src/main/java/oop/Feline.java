package oop;

public abstract class Feline extends Animal {



    public Feline(String food) {
        //System.out.println("super comes first");
        super(food);
    }

    public Feline(String food, int age) {
        super(food, age);
    }

}
