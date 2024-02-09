public class Child {
    public Child() {
        System.out.println("Child Constructor!");
    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }

    public void array() {
        // int nums[] = new int[4];
        int nums[] = { 1, 2, 3, 4 };
        for (int n : nums) {
            System.out.println(n);
        }
    }
}
