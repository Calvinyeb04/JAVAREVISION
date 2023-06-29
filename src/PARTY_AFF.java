import java.util.*;
public class PARTY_AFF {
    public static void main(String[] args)
    {
        Scanner USERINPUT = new Scanner(System.in);

        String Democrat = "Democrat";
        String Republican = "Republican";
        String Independent = "Independent";




        String PARTY;


        PARTY = SafeInput.getNonZeroLenString(USERINPUT,"Enter Your Party");
        if (PARTY.equalsIgnoreCase(Democrat))
        {
            System.out.println("You get a Democratic Donkey");
        }
        else if (PARTY.equalsIgnoreCase(Republican))
        {
            System.out.println("You get a Elephant");
        }
        else if (PARTY.equalsIgnoreCase(Independent))
        {
            System.out.println("You get a Person");
        }



    }
}







/* Task 5 (3 pts): (This task uses Strings and an if..then..elseif cascade) A
program that prompts the user for their party affiliation (Democrat,
Republican, or Independent) and responds accordingly with a Donkey,
Elephant, or Man. (i.e. “You get a Democratic Donkey.”)
 */