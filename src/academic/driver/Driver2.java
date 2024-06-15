package academic.driver;

import academic.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver2 {

    private static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();

            if (input.equals("---")) {
                break;
            }

            String[] tokens = input.split("#");

            switch (tokens[0]) {
                case "student-add":
                    if (tokens.length == 5) {
                        String id = tokens[1];
                        String name = tokens[2];
                        String gpa = tokens[3];
                        String credit = tokens[4];
                        Student student = new Student(id, name, gpa, credit);
                        students.add(student);
                    }
                    break;
                case "student-show-all":
                    for (Student student : students) {
                        System.out.println(student);
                    }
                    break;
                case "student-best":
                    if (tokens.length == 2) {
                        int n = Integer.parseInt(tokens[1]);
                         students.sort((s1, s2) -> {
                        double gpa1 = Double.parseDouble(s1.getGPA());
                        double gpa2 = Double.parseDouble(s2.getGPA());
                     if (gpa1 == gpa2) {
                     return s1.getId().compareTo(s2.getId());
                  }
                return Double.compare(gpa2, gpa1);
          });
                 for (int i = 0; i < Math.min(n, students.size()); i++) {
                System.out.println(students.get(i));
        }
    }
    break;

               
            }
        }
    }
}
