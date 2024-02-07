public class InnerClass {
    public static void main(String args[]) {
        A a = new A();
        a.show();

        A.C c = new A.C(); // To access the static methods, we access the classes with the Main Class type
                           // and create the object and then access the static method for the execution!
        c.config();

        A.B b = a.new B(); // B class is a part of class B so we need to use A.B as type and to create a
                           // object for B we need to use the reference obj variable of A class.
        b.configuration();

    }
}

class A { // can not make the outer class as static. can only be possible for the inner
          // classes.
    int age;

    public void show() { // non static method.
        System.out.println("in A Show method!");
    }

    class B { // static method.
        public void configuration() {
            System.out.println("in B Configuration method!");
        }
    }

    static class C { // static method.
        public void config() {
            System.out.println("in B Config method!");
        }
    }
}
