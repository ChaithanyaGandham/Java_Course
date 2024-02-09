public class Interfaces {
    public static void main(String args[]) {
        // We can not create the object for the interface. We can not instantiate them.
        Main b;
        b = new B();
        b.show();
        b.config();
        // b.run(); This will not work since b reference variable does not know about
        // the method run.
        System.out.println(Main.age);
        X x = new B(); // Inorder to call the methods in the interfaces , we need to create another
                       // intance for the class B and use it to access the methods.
        x.run();

    }
}

interface Main { // Interface contains all the methods default as public and abstract.

    int age = 50; // All the variables inside the interface are default final and static.

    void show();

    void config();
}

interface X {
    void run();
}

interface Y extends X {
}

class B implements Main, X {
    public void show() {
        System.out.println("in Show");
    }

    public void config() {
        System.out.println("in config!");
    }

    public void run() {
        System.out.println("in run!");
    }
}