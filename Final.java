public class Final {
    public static void main(String args[]) {
        Parent p = new Parent();
        p.show();
    }
}

class Parent {

    final String name = "Chaithanya";

    // name = "Madhavi"; //Can not modify the final variable it acts as a const
    // variable.
    public final void show() {
        System.out.println("in Class Parent method show");
    }
}

// If the class Parent is provided with Final prefixed then it can not be
// extended.
class Child extends Parent {
    public void show1() {
        System.out.println("in Class Child method show");
    }

    // public void show() { Cannot override a method since it is provided with final
    // keyword.

    // }
}