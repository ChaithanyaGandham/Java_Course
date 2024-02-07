public class Enum {
    public static void main(String args[]) {
        Status ss[] = Status.values();

        for (Status s : ss) {
            System.out.println(s + " : " + s.ordinal());
        }

        Status s = Status.Running;

        switch (s) {
            case Running:
                System.out.println("All Good");
                break;
            case Pending:
                System.out.println("Try again");
                break;
            case Failed:
                System.out.println("Better luck next time");
                break;
            default:
                System.out.println("Succeeded!");
                break;
        }

        Laptop lap[] = Laptop.values();

        for (Laptop laps : lap) {
            // laps.setPrice(6000);
            System.out.println(laps + " : " + laps.getPrice());
        }
    }
}

enum Status {
    Running,
    Failed,
    Success,
    Pending
}

enum Laptop {
    Macbook(2000),
    XPS(1200),
    Dell(500),
    Thinkpad(900);

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private Laptop(int price) { // Private Constructor we are creating the object in the same class.
        this.price = price;
        System.out.println("in Laptop " + this.name());
    }
}