import java.util.*;
public class GRADE {
    public static void main(String[] args) {
        boolean GRADEAVGCONTINUE = true;
        while (GRADEAVGCONTINUE) {

            String YESORNO;


            Scanner USERINPUT = new Scanner(System.in);

            Double GRADESUM = 0.0;
            Double DATA;
            int ENTRE = 0;
            int Count = 0;
            double AVERAGE;

            DATA = SafeInput.getRangedDouble(USERINPUT, "Enter The Grade", 0, 100);
            GRADESUM += DATA;
            Count++;

            AVERAGE = DATA/Count;

            YESORNO = SafeInput.getRegExString(USERINPUT, "Do you want to add another Grade  or print the average? (yes/no)", "(?i)^(yes|no)$");
            if (YESORNO.equalsIgnoreCase("No")) {
                GRADEAVGCONTINUE = false;
                System.out.println("AVERAGE: " + AVERAGE);
                System.out.println("THANKS FOR USING THIS");
            }
        }

    }
}



/*Task 3 (3 pts): A program that collects a series of grades (ranging 0 –
100) until the user indicates that they don’t want to continue entering
values useing a sentinel value. -1 is a good choice for a sentinel here.)
The program should display the average of the grades entere*/