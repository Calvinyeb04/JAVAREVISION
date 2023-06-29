import java.util.*;
public class RPS {
    public static void main(String[] args) {
        boolean RPSGAMECONTINUE = true;
        while (RPSGAMECONTINUE) {
            Scanner USERINPUT = new Scanner(System.in);
            String YN;


            String ROCK = "R";
            String PAPER = "P";
            String SCICCORS = "S";

            String RPS;
            String MOVE_1;
            String MOVE_2;

            String NAME_P1;
            String NAME_P2;

            NAME_P1 = SafeInput.getNonZeroLenString(USERINPUT, "ENTER YOUR NAME PLAYER 1");
            NAME_P2 = SafeInput.getNonZeroLenString(USERINPUT, "ENTER YOUR NAME PLAYER 1");


            String PLAYERA = NAME_P1;
            String PLAYERB = NAME_P2;


            System.out.println("HELLO: " + PLAYERA);
            System.out.println("HEELO: " + PLAYERB);


            MOVE_1 = SafeInput.getRegExString(USERINPUT, PLAYERA + ":" +"ENTER YOUR MOVE(R,P,S) " , "[Rr,Pp,Ss]");
            System.out.println(PLAYERA + ": " + "You Entered" + ": " + MOVE_1);

            MOVE_2 = SafeInput.getRegExString(USERINPUT, PLAYERB +":" + "ENTER YOUR MOVE(R,P,S","[Rr,Pp,Ss]");
            System.out.println(PLAYERB +": " +  "You Entered" + ": "+ MOVE_2);

            if (MOVE_1.equalsIgnoreCase("R") && MOVE_2.equalsIgnoreCase("S")) {
                System.out.println(PLAYERA + ": You Win");
            }
            else if (MOVE_1.equalsIgnoreCase("R") && MOVE_2.equalsIgnoreCase("P")) {
                System.out.println(PLAYERB + ": You Win");
            }
            else if (MOVE_1.equalsIgnoreCase("P") && MOVE_2.equalsIgnoreCase("R")) {
                System.out.println(PLAYERA + ": You Win");
            }
            else if (MOVE_1.equalsIgnoreCase("P") && MOVE_2.equalsIgnoreCase("S")) {
                System.out.println(PLAYERB + ": You Win");
            }
            else if (MOVE_1.equalsIgnoreCase("S") && MOVE_2.equalsIgnoreCase("R")) {
                System.out.println(PLAYERB + ": You Win");
            }
            else if (MOVE_1.equalsIgnoreCase("S") && MOVE_2.equalsIgnoreCase("P")) {
                System.out.println(PLAYERA + ": You Win");
            }
            else {
                System.out.println("It's a tie");
            }



            YN = SafeInput.getRegExString(USERINPUT, "Do You Want To Play Again? (yes/no)", "(?i)^(yes|no)$");
            if (YN.equalsIgnoreCase("No")) {
                RPSGAMECONTINUE = false;
                System.out.println("THANKS FOR PLAYING");
            }


        }
    }
}

/* Task 4 (5 pts): Rock Paper Scissors: The game repeats as long as the user
enters Y to a prompt to continue. Get a move from player A and then
from player B. Assume that the move is valid so it has to be one of the 3
choices (R P or S). Your program should compute the winner with an
appropriate output string: “Rock Breaks Scissors Player A wins, etc...
And then prompt to play again..*/