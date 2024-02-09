public class ExampleThread {
    public static void main(String args[]) {
        Runnable obj1 = new A();
        Runnable obj2 = new B();

        Thread th1 = new Thread(obj1);
        Thread th2 = new Thread(obj2);

        th1.start();
        th2.start();
    }
}

class A implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}