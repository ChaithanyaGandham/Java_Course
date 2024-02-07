public class NeedInterface {
    public static void main(String args[]) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer dev = new Developer();
        dev.devApp(desk);
    }
}

class Developer {
    // Using Laptop instance as an argument for the method is tighly coupled.
    // We can not use the desktop object because of that.
    // Hence to make it a loosely coupled we need to create an Interface.
    public void devApp(Computer lap) {
        lap.code();
    }
}

class Laptop implements Computer {
    public void code() {
        System.out.println("Coding!!");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("Code faster!");
    }
}

interface Computer {
    void code();
}