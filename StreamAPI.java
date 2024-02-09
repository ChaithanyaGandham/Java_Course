import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String args[]) {

        List<Integer> li = Arrays.asList(2, 3, 5, 6, 7);

        // Stream<Integer> s1 = li.stream();

        // Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);

        // Stream<Integer> s3 = s2.map(n -> n * 2);

        // int result = s3.reduce(0, (c, e) -> c + e);

        // System.out.println(result);

        int result = li.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);

        System.out.println(result);

        // s2.forEach(n -> System.out.println(n));
        // int sum = 0;
        // for (int n : li) {
        // if (n % 2 == 0) {
        // n = n * 2;
        // sum = sum + n;
        // }
        // }
        // System.out.println(sum);
    }
}
