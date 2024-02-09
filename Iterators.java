import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class Iterators {
    public static void main(String args[]) {

        Collection<Integer> c = new TreeSet<Integer>();

        c.add(45);
        c.add(90);
        c.add(78);
        c.add(49);
        c.add(34);

        Iterator<Integer> values = c.iterator();

        while (values.hasNext())
            System.out.println(values.next());

    }
}
