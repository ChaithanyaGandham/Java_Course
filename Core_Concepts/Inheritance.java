public class Inheritance {
    public static void main(String args[]) {
        // AdvanceChild ch = new AdvanceChild();
        // int r1 = ch.add(4, 7);
        // int r2 = ch.sub(6, 4);
        // int r3 = ch.multi(6, 4);
        // int r4 = ch.div(6, 4);
        // System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
        AdvCalc ac = new AdvCalc();
        int result = ac.add(4, 8);
        System.out.println("result " + result);

        Child ch = new Child();
        ch.array();
    }
}

class Calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }
}

class AdvCalc extends Calc {
    // public int add(int n1, int n2) {
    // return n1 + n2 + 1;
    // }
}