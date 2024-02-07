public class Abstract {
    public static void main(String args[]) {
        WagonR w = new WagonR(); // We can only create the class for the non abstract class.
        w.drive();
        w.playMusic();
    }
}

abstract class Car {

    abstract public void drive(); // If one of the method is abstract then the class should be prefixed with
                                  // static
                                  // keyword.

    public void playMusic() {
        System.out.println("Playing music...");
    }
}

class WagonR extends Car { // The class which extends a abstract then the methods are defined in the
                           // extended class.
    public void drive() {
        System.out.println("Driving...");
    }
}