import java.util.*;
public class RegEx {

    public static void main(String[] args) {
        Scanner USERINPUT = new Scanner(System.in);

        String NAME;
        String SSN;
        String ID;


       /*
        NAME = SafeInput.getNonZeroLenString(USERINPUT, "ENTER YOUR FULL NAME");

        SSN = SafeInput.getRegExString(USERINPUT, "ENTER YOUR SSN(###-##-####)","\\d{3}-\\d{2}-\\d{4}");

        ID = SafeInput.getRegExString(USERINPUT, "ENTER YOUR UC ID (FOLLOWING WITH THE M", "(M|m)\\d{5}");


        System.out.println("INFO:" + NAME + "" + ID + "" + SSN);

        */


        //MENU//


        String MENU;
        String ADD;
        String ADDANOTHER;
        String DELETE;
        String QUIT;
        ArrayList<String> LISTMAKERARRAY = new ArrayList<>();

        while (true) {
            MENU = SafeInput.getRegExString(USERINPUT, "SELECT A MENU OPTION (A, D, P, Q): ", "[Aa,Dd,Pp,Qq]");
            int counter = 1; // Counter for numbering the elements


            if (MENU.equalsIgnoreCase("A")) {

                do {
                    ADD = SafeInput.getNonZeroLenString(USERINPUT, "What do you want to add?");
                    LISTMAKERARRAY.add(ADD);
                    System.out.println("You entered: " + ADD);

                    ADDANOTHER = SafeInput.getRegExString(USERINPUT, "Do you want to add another one", "(?i)Yes|No");
                } while (ADDANOTHER.equalsIgnoreCase("Yes"));


            } else if (MENU.equalsIgnoreCase("D")) {
                DELETE = SafeInput.getRegExString(USERINPUT, "Which List Do You Want To Delete" + LISTMAKERARRAY, "[1-9]");
                int deleteIndex = Integer.parseInt(DELETE) - 1;

                // Remove the element at the specified index
                if (deleteIndex >= 0 && deleteIndex < LISTMAKERARRAY.size()) {
                    LISTMAKERARRAY.remove(deleteIndex);
                    System.out.println("-----------------------------------");
                    System.out.println("UPDATED LIST:");

                    // Display the updated list with numbering
                    for (int i = 0; i < LISTMAKERARRAY.size(); i++) {
                        System.out.println((i + 1) + ". " + LISTMAKERARRAY.get(i));
                    }
                } else {
                    System.out.println("Invalid input. Please try again.");
                }
            }


            else  if (MENU.equalsIgnoreCase("Q")) {
                    QUIT = SafeInput.getRegExString(USERINPUT, "DO YOU WANT TO QUIT", "(?i)Yes|No");
                    if (QUIT.equalsIgnoreCase("YES")) {
                        System.exit(0); // Terminate the program
                    }
                }


            }

        }


    }


