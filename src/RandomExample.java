import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(1) + 1;
        System.out.println("Random number: " + randomNumber);
    }
}
