class Main {
    public static void main(String args[]) {
        B b = new B(5);
    }
}

class A {
    public A() {
        super();
        System.out.println("::in A");
    }

    public A(int n) {
        super();
        System.out.println(":: in A int");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("::in B");
    }

    public B(int n) {
        this();
        System.out.println("::in B int");
    }
}