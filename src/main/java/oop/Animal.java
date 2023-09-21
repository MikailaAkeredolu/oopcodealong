package oop;

public abstract class Animal  {

    protected String food;
    private int age;

    public Animal(String food){
        this.food = food;
    }

    public Animal(String food, int age){
        this.food = food;
        this.age = age;
    }

    //Abstract Method- // signature
    public abstract void printAnimalFood(String message);

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
