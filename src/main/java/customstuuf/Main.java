package customstuuf;

public class Main {
    public static void main(String[] args) {
        //Use a Static method
        //ClassName.methodName();
        try {
            Person.findUserByName("");
        } catch (MyCustomException e) {
            e.printStackTrace();
        }
    }
}
