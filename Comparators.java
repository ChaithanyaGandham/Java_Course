import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparators {
    public static void main(String args[]) {

        Comparator<Integer> com = (Integer i, Integer j) -> i % 10 > j % 10 ? 1 : -1;

        List<Integer> nums = new ArrayList<>();
        nums.add(93);
        nums.add(71);
        nums.add(42);
        nums.add(26);
        nums.add(14);

        Collections.sort(nums, com);
        System.out.println(nums);
    }
}
