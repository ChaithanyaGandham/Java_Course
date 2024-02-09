import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int i = scan.nextInt();
        System.out.println("Enter Double number");
        double d = scan.nextDouble();
        System.out.println("Enter String");
        String s = scan.nextLine();
        s = "";
        s += scan.nextLine();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

    }
}
