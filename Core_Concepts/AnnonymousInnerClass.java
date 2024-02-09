public class AnnonymousInnerClass {
    public static void main(String args[]) {
        A a = new A() {
            public void show() {
                System.out.println("in new show!");
            }
        };
        a.show();

        B b = new B() { // Annonymous Inner Class with no className. We are creating the object for the
                        // annonymous class but not for the abstract class here to be noted!.
                        // When you want to use the below only once then we opt for annonymous Inner
                        // class.
            public void show() {
                System.out.println("in C show!");
            }
        };
        b.show();
    }
}

class A {
    public void show() {
        System.out.println("in A show!");
    }
}

abstract class B {
    abstract public void show();
}