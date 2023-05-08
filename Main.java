import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        int x = number * number;
        System.out.println("The square root of the number " + number + " is " + x);

        double y = Math.pow(number, 2);
        System.out.println("Another way to do the sqrt, but same result: " + y);

    }
}