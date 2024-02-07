// Lambda Expression can only be works with functional interface.
// Adds syntactical sugar and optimises the code.
// Does not create annonymous class after compilation.
public class LambdaExp {
    public static void main(String args[]) {
        A a = (h) -> System.out.println("I am in Show! " + h);
        a.show(5);

        B b = (i, j) -> i + j; // If you returning an exp then you need not need to specify the return keyword.
        int result = b.add(4, 5);
        System.out.println("result : " + result);
    }
}

@FunctionalInterface
interface A {
    void show(int i);
}

@FunctionalInterface
interface B {
    int add(int a, int b);
}