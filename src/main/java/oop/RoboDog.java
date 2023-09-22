package oop;

public class RoboDog implements IPet {


    @Override
    public void greetOwner() {
        System.out.println("Wags it digital tail and lights up!!! ");
    }

    @Override
    public String toString() {
        return "RoboDog{}";
    }
}
