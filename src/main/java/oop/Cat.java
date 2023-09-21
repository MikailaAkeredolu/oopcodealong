package oop;

public  class Cat extends Feline implements IPet{


    public Cat(String food) {
        super(food);
    }

    public Cat(String food, int age) {
        super(food, age);
    }

    @Override
    public void printAnimalFood(String message){
        System.out.println("I am a cat - ");
        System.out.println(message + "" + food);
    }

    @Override
    public void greetOwner() {
        System.out.println("jumps on you and scratches your face, Spit in your face");
    }


}
