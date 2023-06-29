import java.util.*;
public class RANDOM {
    public static void main(String[] args)
    {
        Scanner USERINPUT = new Scanner(System.in);

        Random rnd = new Random();

        int val = rnd.nextInt(100); // gives a value from 0 to 99
        System.out.println("Random value from 0 to 99: " + val);

        int valInRange = rnd.nextInt(100) + 1; // gives a value from 1 to 100
        System.out.println("Random value from 1 to 100: " + valInRange);

        int[] myArray = {10, 20, 30, 40, 50};
        int index = rnd.nextInt(myArray.length); // gives a random valid index on myArray
        System.out.println("Random index from myArray: " + index);
        System.out.println("Element at random index: " + myArray[index]);


    }
}
