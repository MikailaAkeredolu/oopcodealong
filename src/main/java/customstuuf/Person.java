package customstuuf;

public class Person {

    public static Person findUserByName(String username) throws MyCustomException {
        String emptyString = "";
        if(emptyString.equals(username)){
            throw new MyCustomException("Name cannot be empty");
        }

        return new Person();
    }

    @Override
    public String toString() {
        return "Person{}";
    }
}
