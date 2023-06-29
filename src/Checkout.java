import java.util.*;
public class Checkout {
    public static void main(String[] args)
    {
        boolean CHECKOUTCONTINUE = true;
        while (CHECKOUTCONTINUE) {

            Scanner USERINPUT = new Scanner(System.in);

            Double SHIPCALC;
            String YESORNO;
            Double ITEMPRICE;
            Double TOTAL = 0.0;
            Double SUM;
            String ITEMNAME;


            ITEMNAME = SafeInput.getNonZeroLenString(USERINPUT, "Enter Item Name");
            ITEMPRICE = SafeInput.getDouble(USERINPUT, "Enter Item Price");

            TOTAL += ITEMPRICE;

            SHIPCALC = TOTAL * 0.02;
            SUM = TOTAL + SHIPCALC;


            YESORNO = SafeInput.getRegExString(USERINPUT, "Do You Want To Add Another Item", "(?i)^(yes|no)$");
            if (YESORNO.equalsIgnoreCase("NO")) {
                if (TOTAL >= 100) {
                    CHECKOUTCONTINUE = false;
                    System.out.println("YOUR SHIPPING IS FREE");
                    System.out.println("TOTAL: " + TOTAL);
                }


                else if (TOTAL < 100) {
                    CHECKOUTCONTINUE = false;

                    System.out.println("Sorry You Don't Qualify For Free Shipping");
                    System.out.println("SHIPPING: " + SHIPCALC);
                    System.out.println("TOTAL: " + SUM);

                }
            }
        }
    }




    }




/*
* Task 1 (3 pts): an application program where the user enters the price of
a series of items (assume at least one.) (Prompt user for additional items
until they are done, so we don’t know ahead how many items there will
be. This is the looping part! ;) ) The program computes shipping costs.
Copyright © 2019-2020, University of Cincinnati, Ohio. All rights reserved.
If the total price of all items is $100 or more, then shipping is free
otherwise it is 2% of the price. The program should output the total price
of all items, the shipping cost, and the total cost.
**/