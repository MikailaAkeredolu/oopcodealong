package oop;

public class Wolf extends Canine{


    public Wolf(String food) {
        super(food);
    }

    @Override
    public void printAnimalFood(String message) {
        System.out.println("some food from dushane - topBoy" + message);
    }
}
