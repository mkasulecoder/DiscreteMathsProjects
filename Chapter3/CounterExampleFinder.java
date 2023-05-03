package Chapter3;

/**
 * The CounterExampleFinder program finds a counterexample for a given logical statement.
The program assumes that the logical statement is "For all x, if x is an even integer, then x/2 is not an integer".
The program searches for an even integer x from a given set of values, for which x/2 is not an integer. If such a value is found, it is considered as a counterexample to the logical statement.
The program displays the set of values that the search is conducted on and the result of the search, which is either a counterexample or a statement that the logical statement holds for all values in the set.
* @author Mark Kasule
 */
import java.util.Arrays;
import java.util.Scanner;

public class CounterExampleFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // suppose the logical statement is "For all x, if x is an even integer, then
        // x/2 is an integer"
        // we want to find a counterexample, i.e., an even integer x for which x/2 is
        // not an integer
        System.out.println("For all x, if x is an even integer, then x/2 is not an integer");
        int[] predicate = { 2, 4, 6, 8, 10, 12 };
        System.out.println("Predicate values: " + Arrays.toString(predicate));

        int counterexample = -1;
        for (int element : predicate) {
            if (element % 2 == 0 && element / 2 % 2 != 0) {
                counterexample = element;
            }
        }

        if (counterexample == -1)
            System.out.println("The statement is true for all values of x.");
        else
            System.out.println("The statement is false for x = " + counterexample + ".");
    }
}
