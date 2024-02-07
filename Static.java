public class Static {
    public static void main(String args[]) throws ClassNotFoundException {
        Mobile mb = new Mobile();
        mb.brand = "Apple";
        mb.price = 1000;
        mb.show();
        Mobile mb2 = new Mobile();
        mb2.show();

        Mobile.show1(mb);
        // Class.forName("Mobile"); // used to create a instance for a Class.
    }
}

class Mobile {
    String brand;
    int price;
    static String name;

    Mobile() {
        brand = "Smart";
        price = 200;
        System.out.println("in Constructor!");
    }

    static {
        System.out.println("in static block!"); // Called when a class loads.
        name = "Foldable Phones"; // Called only when a new Object got created.
    }

    void show() {
        System.out.println("brand : " + brand + " : " + price + " : " + name);
    }

    public static void show1(Mobile obj) { // only with a object reference we can use the instance variables.
        System.out.println("static method called!");
        System.out.println("brand : " + obj.brand + " : " + obj.price + " : " + name); // brand and price are instance
                                                                                       // variables
        // unlike name which is a static
        // varaible.
    }
}
