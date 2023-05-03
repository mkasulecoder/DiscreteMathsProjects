package Chapter9;

/**
 * List the factorial of a number entered by user
 * Chapter 9 - recursion
 * 
 * @author Mark Kasule
 */

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("What's the factorial of \nNumber should be greater than 1: ");
            int num = input.nextInt();

            // Print the factorial
            System.out.println("Factorial of: " + num + " is " + factorial(num));
        }
    }

    public static int factorial(int num) {
        if (num == 0)
            return 1;
        else
            return num * factorial(num - 1);
    }
}
