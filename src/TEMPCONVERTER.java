import java.util.Scanner;

public class TEMPCONVERTER {

    public static void main(String[] args)
    {
        String CELSIUS;
        double FORMULA;
        int FAHRENHEIT;


        Scanner USERINPUT = new Scanner(System.in);
        FAHRENHEIT = SafeInput.getInt(USERINPUT, "ENTER YOUR TEMPERATURE IN FAHRENHEIT");

        FORMULA = (9/5 * FAHRENHEIT )+ 32;


        System.out.println("CELSIUS: " + FORMULA );




    }
}





/* !
Task 1 (2 pt): A program that converts a temperature in F that the user
provides and returns the equivalent temperature in C. Hint: Google is
your friend! Given F, solve for C. This program does not require an if
structure and has a straight forward input – process – output structure
*/