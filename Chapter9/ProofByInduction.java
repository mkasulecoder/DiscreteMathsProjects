/**
This program is used to prove the formula n * (n + 1) / 2 
using mathematical induction. The user is prompted to enter the number of
iterations to be proven, n. The program then computes the sum of the first n 
integers using a loop, and compares it to the expected value using the 
formula n * (n + 1) / 2. If the two values match, the formula is 
considered proven for the given n. If the values do not match, the 
formula is not considered proven for the given n.
@author Mark Kasule
*/
package Chapter9;

import java.util.Scanner;

public class ProofByInduction {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of iterations: ");
        int n = input.nextInt(); // the number of iterations we want to prove

        // initialize the sum to 0
        int sum = 0;

        // Accumulate the sum
        for (int x = 1; x <= n; x++) {
            sum += x;
        }

        // Sum of each value at a given index per iteration
        int expectedTotalSum = (n * (n + 1)) / 2;

        if (sum == expectedTotalSum)
            System.out.println("The formular n * (n + 1) / 2 holds for n = " + n);
        else
            System.out.println("The formular n * (n + 1) / 2 does not hold for n = " + n);
    }
}
