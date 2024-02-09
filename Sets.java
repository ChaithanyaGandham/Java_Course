import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String args[]) {

        Set<Integer> s = new TreeSet<Integer>(); // For sorting use Treeset and for normal List we can use HashSet

        s.add(30);
        s.add(6);
        s.add(3);
        s.add(7);
        s.add(9);

        for (int n : s) {
            System.out.println(n);
        }
    }
}
