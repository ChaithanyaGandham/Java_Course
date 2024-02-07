public class Throw {
    public static void main(String args[]) {
        int i = 20;
        int j = 18;

        try {
            j = 18 / i;
            if (j == 0)
                throw new CustomException("Do not want to show zero!");
        } catch (CustomException e) {
            j = 18 / 1;
            System.out.println("Default Output" + e);
        }
    }
}

// Custom Exception!

class CustomException extends Exception {
    public CustomException(String str) {
        super(str);
    }
}