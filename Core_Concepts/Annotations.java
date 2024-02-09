public class Annotations {
    public static void main(String args[]) {
        B b = new B();
        b.show();
    }
}

class A {
    public void show() {
        System.out.println("I am in A show!");
    }
}

class B extends A {

    @Override
    public void show() {
        System.out.println("I am in B show!");
    }
}
