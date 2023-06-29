import java.util.Random;
import java.util.Scanner;

public class Dice_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomGenerator = new Random();

        String player1, player2;

        System.out.print("PLAYER_1: Enter Your Name: ");
        player1 = scanner.nextLine();
        System.out.print("PLAYER_2: Enter Your Name: ");
        player2 = scanner.nextLine();

        while (true) {
            System.out.println(player1 + ", enter (ROLL) to roll your dice");
            String input1 = scanner.nextLine();
            if (input1.equalsIgnoreCase("ROLL")) {
                int dice1 = randomGenerator.nextInt(6) + 1;
                System.out.println("Dice: " + dice1);

                System.out.println(player2 + ", enter (ROLL) to roll your dice");
                String input2 = scanner.nextLine();
                if (input2.equalsIgnoreCase("ROLL")) {
                    int dice2 = randomGenerator.nextInt(6) + 1;
                    System.out.println("Dice: " + dice2);

                    if (dice1 < dice2) {
                        System.out.println(player2 + " wins!");
                    } else if (dice1 > dice2) {
                        System.out.println(player1 + " wins!");
                    } else {
                        System.out.println("It's a tie!");
                    }
                } else {
                    System.out.println("Invalid input. Try again.");
                }
            } else {
                System.out.println("Invalid input. Try again.");
            }
        }
    }
}
