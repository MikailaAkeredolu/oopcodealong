package oop;

public class Dog extends Canine implements IPet{
// Is A relationship - Inheritance
    private String greet;

    public Dog(String food) {
        super(food);
    }

    public Dog(String food, int age) {
        super(food, age);
    }

    @Override
    public void printAnimalFood(String message) {
        System.out.println("Dogs eat" + food  + " and the greet you by " + greet + " and message ->" + message);
    }

    @Override
    public void greetOwner() {
        System.out.println("jumps on you and licks your feet or face");
    }
}
