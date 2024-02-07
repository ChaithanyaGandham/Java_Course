public class FunctionalInterfacea {
    public static void main(String args[]) {
        A obj = new A() {
            public void run() {
                System.out.println("I am in run method!");
            }
        };
        obj.run();
    }
}
// Functional Interface is the interface which contains only one functional
// abstract method inside the interface.
// @FunctionalInterface decorator is used to mention this.

@FunctionalInterface
interface A {

    void run();
}
