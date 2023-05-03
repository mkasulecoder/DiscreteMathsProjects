import java.util.HashSet;
import java.util.Set;

/**
 * In this example, we first create the universal set universe containing the
 * integers 1 to 10. Then, we create the set s containing the integers 2, 4, and
 * 6. To get the complement of s, we create a new set sComplement initialized
 * with the elements of the universe set using the constructor
 * HashSet<>(universe). We then remove all elements of s from sComplement using
 * the removeAll() method. The resulting set sComplement contains all elements
 * of universe that are not in s.
 * 
 * @author Mark Kasule
 */

public class SetComplement {
    public static void main(String[] args) {
        // create the universal set
        Set<Integer> universe = new HashSet<>();
        for (int i = 1; i <= 10; i++) {
            universe.add(i);
        }

        // create the set
        Set<Integer> s = new HashSet<>();
        s.add(2);
        s.add(4);
        s.add(6);

        // get the complement of s
        Set<Integer> sComplement = new HashSet<>(universe);
        sComplement.removeAll(s);

        System.out.println("Set S: " + s);
        System.out.println("Complement of S: " + sComplement);
    }
}
