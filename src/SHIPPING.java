import java.util.Scanner;

public class SHIPPING {

    public static void main(String[] args)
    {
        String NAME;
        double ITEM;
        int COST_REQ = 100;
        Double SHIPPINGCALC ;

        Scanner USERINPUT = new Scanner(System.in);
        NAME = SafeInput.getNonZeroLenString(USERINPUT,"ENTER YOUR NAME");

        ITEM = SafeInput.getDouble(USERINPUT,"ENTER THE COST OF ITEM");

        if (ITEM >= COST_REQ)
        {
            System.out.println("YOU GET FREE SHIPPING" + "TOTAL: " + ITEM);
        }
        else
        {
            SHIPPINGCALC = (ITEM * 0.02) + ITEM;
            System.out.println("SORRY , YOU DON'T GET FREE SHIPPING" + "TOTAL : " + SHIPPINGCALC);
        }
    }

}



/*
Task 3 (3 pts) : an application program where the user enters the price of
an item and the program computes shipping costs. If the item price is
$100 or more, then shipping is free otherwise it is 2% of the price. The
program should output the shipping cost and the total price.
*/