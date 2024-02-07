import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryFinally {
    public static void main(String args[]) throws IOException {
        int num = 0;
        // try {
        // InputStreamReader in = new InputStreamReader(System.in);
        // br = new BufferedReader(in);
        // System.out.println("Enter a number : ");
        // num = Integer.parseInt(br.readLine());
        // System.out.println(num);

        // } finally {
        // br.close();
        // }

        // Try with resources!
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter a number : ");
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
    }
}
