public class upCasting {
    public static void main(String args[]) {
        Parent p = (Parent) new Child(); // Upcasting!
        p.show();

        Child ch = (Child) p; // Down casting!
        ch.show2();
    }
}

class Parent {
    public void show() {
        System.out.println("in Parent show!");
    }
}

class Child extends Parent {
    public void show2() {
        System.out.println("in Child show!");
    }
}