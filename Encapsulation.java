class Demo {
    public static void main(String args[]) {

        Human h1 = new Human();
        System.out.println(h1.getAge() + " : " + h1.getName());

        Human h2 = new Human(30, "Karunya");
        System.out.println(h2.getAge() + " : " + h2.getName());
    }
}

class Human {

    private int age;
    private String name;

    public Human() { // Default Constructor!
        age = 12;
        name = "Chaithanya";
    }

    public Human(int age, String name) { // Constructor Overloading
        this.age = age;
        this.name = name;
    }

    // Getters and setters for the instance variables.
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}