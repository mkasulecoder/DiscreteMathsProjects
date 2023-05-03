import java.util.HashSet;
import java.util.Set;

/**
 * This program creates two sets setA and setB, adds some elements to them, and
 * then performs some set operations on them. Specifically, it computes the
 * union, intersection, and difference of setA and setB, and prints the results
 * to the console.
 * 
 * @author Mark Kasule
 */
public class SetTheory {
    public static void main(String[] args) {
        // Create two sets
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        // Add elements to set A
        setA.add(1);
        setA.add(2);
        setA.add(3);

        // Add elements to set B
        setB.add(2);
        setB.add(3);
        setB.add(4);

        // Print the sets
        System.out.println("Set A: " + setA);
        System.out.println("Set B: " + setB);

        // Compute the union of sets A and B
        Set<Integer> union = new HashSet<>(setA);
        union.addAll(setB);
        System.out.println("Union of A and B: " + union);

        // Compute the intersection of sets A and B
        Set<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);
        System.out.println("Intersection of A and B: " + intersection);

        // Compute the difference of sets A and B
        Set<Integer> difference = new HashSet<>(setA);
        difference.removeAll(setB);
        System.out.println("Difference of A and B: " + difference);
    }
}
