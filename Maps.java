import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String args[]) {

        Map<String, Integer> students = new HashMap<>();

        students.put("Navin", 90);
        students.put("Chandra", 40);
        students.put("Sreenu", 50);
        students.put("Mani", 95);
        students.put("Tom", 80);

        System.out.println(students.keySet());

        for (String key : students.keySet()) {
            System.out.println(key + " :  " + students.get(key));
        }
    }
}
