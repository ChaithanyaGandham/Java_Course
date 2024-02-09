import java.util.ArrayList;

public class Collections {
    public static void main(String args[]) {

        ArrayList<Integer> c = new ArrayList<Integer>();
        c.add(5);
        c.add(6);
        c.add(7);
        c.add(8);
        c.add(8);

        for (int n : c) {
            System.out.println(n);
        }
    }
}
