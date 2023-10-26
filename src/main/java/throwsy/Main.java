package throwsy;
//Throw and Throws
public class Main {

    public static void partyWithBadBunny (int age) throws IllegalArgumentException{
        if(age < 21){
            throw new IllegalArgumentException("Not old enough to party with Bad Bunny");
        }
    }

    public static void main(String[] args) {

        partyWithBadBunny(13);

    }
}
