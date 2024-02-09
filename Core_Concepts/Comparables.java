import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name =" + name + "]";
    }

    public int compareTo(Student that) {
        if (this.age > that.age)
            return 1;
        else
            return -1;
    }
}

public class Comparables {
    public static void main(String args[]) {

        List<Student> studs = new ArrayList<>();

        studs.add(new Student(21, "Chaithanya"));
        studs.add(new Student(45, "Madhavi"));
        studs.add(new Student(12, "Navin"));
        studs.add(new Student(9, "Chandra"));
        studs.add(new Student(10, "Mani"));

        Collections.sort(studs);

        for (Student s : studs)
            System.out.println(s);
    }
}
