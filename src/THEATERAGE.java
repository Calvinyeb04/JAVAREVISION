import java.util.Scanner;
public class THEATERAGE {

    public static void main(String[] args)
    {
        String NAME;
        int AGE;
        int AGE_REQUIREMENT = 21;
        String OLD =" YOU GET A WRIST BAND, ENJOY";
        String YOUNG = "ENJOY , YOU DON'T GET A WRIST BAND";

        Scanner USERINPUT = new Scanner(System.in);

        NAME = SafeInput.getNonZeroLenString(USERINPUT,"ENTER YOUR NAME");

        AGE = SafeInput.getRangedInt(USERINPUT,"ENTER YOUR AGE",0,100);

        if (AGE >= AGE_REQUIREMENT)
        {
            System.out.println(NAME +": " + OLD);
        }
        else
        {
            System.out.println(NAME+": " + YOUNG);
        }





    }
}




/*
Task 2 (2 pts): As people pass through an entry kiosk at the theater, they
are prompted to enter their age. If they are 21 or older, they get a paper
wrist band. Code a logic program that asks the user to enter their age
and then if they are 21 or over displays a message that they get a wrist
band. (Note that the program does nothing if they are not 21 or over...)
*/