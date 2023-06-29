import java.util.Scanner;
public class AGE {
    public static void main(String[] args)
    {
        String NAME;
        int BIRTHMONTH ;
        int BIRTHMONRANGE;


        Scanner USERINPUT = new Scanner(System.in);


        NAME = SafeInput.getNonZeroLenString(USERINPUT,"ENTER YOUR NAME");

        BIRTHMONTH = SafeInput.getInt(USERINPUT,"ENTER YOUR BIRTH MONTH");
        BIRTHMONRANGE = 12;


        if (BIRTHMONTH <= BIRTHMONRANGE)
        {
            System.out.println( NAME + "Your birth month is : " + BIRTHMONTH);
        }
        else
        {
            System.out.println(NAME + "Your birth month is : " + BIRTHMONTH + " "+ "But You entered an incorrect month value:" + BIRTHMONTH) ;

        }


    }
}



/*
Task 4 (3pts): A program that asks the user to enter their birth month
(integer 1 – 12 inclusive). If the user enters a value in range, the program
echoes the input (“Your birth month is: N”) but if the value is not in the
Copyright © 2019-2020, University of Cincinnati, Ohio. All rights reserved.
range it outputs an error msg (“You entered an incorrect month value:
N”). Assume that the user can only enter numbers here
*/