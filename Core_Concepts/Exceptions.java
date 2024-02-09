public class Exceptions {
    public static void main(String args[]) {
        int i = 9;
        int j = 0;

        int k[] = new int[8];
        String str = null;
        try {
            j = 18 / i;
            System.out.println(str.length());
            System.out.println(k[9]);
        } catch (ArithmeticException e) {
            System.out.println("Can not divide by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Need to provide the value within the array index limit!");
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }
        System.out.println(j);
        System.out.println("Bye!");
    }
}
