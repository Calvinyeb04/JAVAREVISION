import java.util.*;

public class NUMBERCOMPARE
{
    public static void main(String[] args) {
        boolean NUMBERCOMPARECONTINUE = true;
        while (NUMBERCOMPARECONTINUE) {

            String YN;

            int NUMBER1;
            int NUMBER2;


            Scanner USERINPUT = new Scanner(System.in);

            NUMBER1 = SafeInput.getInt(USERINPUT, "Enter Your First Number");
            NUMBER2 = SafeInput.getInt(USERINPUT, " Enter Your First Number");


            if (NUMBER1 < NUMBER2) {
                System.out.println(NUMBER1 + " " + "is less than" + " " + NUMBER2);
            } else if (NUMBER2 < NUMBER1) {
                System.out.println(NUMBER2 + " " + "is less than" + " " + NUMBER1);
            } else if (NUMBER1 == NUMBER2) {
                System.out.println(NUMBER1 + " " + "is eqauls to" + " " + NUMBER2);
            }

            YN = SafeInput.getRegExString(USERINPUT, "Do you want to perform another number test or quit? (yes/no)", "(?i)^(yes|no)$");
            if (YN.equalsIgnoreCase("No")) {
                NUMBERCOMPARECONTINUE = false;
                System.out.println("THANKS FOR USING THIS");
            }

        }
    }
}


/*  . Task 6 (3pts): (Extra Credit): A program that takes two inputs and
compares them. And indicates if they are equal or if they are not
indicates the one that is less. (Assume inputs are simple integers although
that is not required and we could have any object that could be compared
in this fashion.
*/