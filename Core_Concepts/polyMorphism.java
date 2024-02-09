public class polyMorphism {
    public static void main(String args[]) {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show(); // Method show is behaving differently in many ways (poly morphism).

        obj = new C();
        obj.show(); // Dynamic method dispatch is happening here because the data is dynamic and
                    // send at the run time.
    }
}

class A {

    public void show() {
        System.out.println("in A show");
    }
}

class B extends A {
    public void show() {
        System.out.println("in B show");
    }
}

class C extends A {
    public void show() {
        System.out.println("in C show");
    }
}