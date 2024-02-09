import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String args[]) {

        List<Integer> li = new ArrayList<Integer>();

        li.add(2);
        li.add(3);
        li.add(5);
        li.add(7);
        li.add(8);

        System.out.println("Index " + li.get(2));

        for (int n : li) {
            System.out.println(n);
        }
    }
}
