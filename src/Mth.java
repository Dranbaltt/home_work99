import java.lang.reflect.Method;

public class Mth {


    public static void main(String[] args) {

        String capitan = "Jhon";
        String navigator = "James";
        String firstMate = "Mary";
        String secondMate = "Oleg";
        add(capitan, navigator, firstMate, secondMate);

    }
//
    static void add(String capitan, String navigator, String firstMate, String secondMate) {
        System.out.println("Capitan is " + capitan +
                "\nNavigator is " + navigator +
                "\nFirst Mate is " + firstMate +
                "\nSecond Mate is " + secondMate);
    }

}
