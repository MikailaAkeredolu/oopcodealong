package oop;

public abstract class Animal  {

    protected String food;
    private static int age;

    public Animal(String food){
        this.food = food;
    }

    //Overloaded constructor
    public Animal(String food, int age){
        this.food = food;
        this.age = age;
    }

    //Abstract Method- // signature
    public abstract void printAnimalFood(String message);

    //Polymorphic method - concrete method
    public static void printAnimalAge(Animal animal){
        System.out.println(animal.getClass().getSimpleName() + " 's age is : " + age);
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "food='" + food + '\'' +
                '}';
    }
}
