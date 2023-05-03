package Chapter3;

/**
 * 
This program checks the validity of a logical statement that "For all x, if x is an even integer, then x/2 is an integer".
It aims to find an even integer x that satisfies this statement.
The program takes a list of integers as the input predicate and checks each element to see if it is an even integer and
if x/2 is also an integer. If such an element is found, it is considered as an example that satisfies the statement.
If no such element is found, then the statement is true for all values of x.
The program prints out the result of the validity check, indicating whether the statement is true or false for the given predicate.

 * @author Mark Kasule
*/

import java.util.Arrays;
import java.util.Scanner;

public class ValidityChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // suppose the logical statement is "For all x, if x is an even integer, then
        // x/2 is an integer"
        // we want to find a example, i.e., an even integer x for which x/2 is
        // also an integer
        System.out.println("For all x, if x is an even integer, then x/2 is an integer");
        int[] predicate = { 3, 4, 6, 7, 10, 12 };
        System.out.println("Predicate values: " + Arrays.toString(predicate));

        int example = 0;
        for (int element : predicate) {
            if (element % 2 == 0 && (element / 2) % 2 == 0) {
                example = element;
            }
        }

        if (example == 0)
            System.out.println("The statement is true for all values of x.");
        else
            System.out.println("The statement is false for x = " + example + ".");
    }
}
