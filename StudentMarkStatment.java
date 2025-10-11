import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StudentMarkStatment {
    static class Student {
        int id;
        String name;
        List<Integer> marks;
        String department;

        public Student(int id, String name, List<Integer> marks, String department) {
            this.id = id;
            this.name = name;
            this.marks = marks;
            this.department = department;
        }
    }


    @FunctionalInterface
    interface GradeCalculator {
        String calculateGrade(double averageMarks);
    }

    public class StudentGradeSystem {
        public static void main(String[] args) {

            List<Student> students = Arrays.asList(
                    new Student(1, "John", Arrays.asList(80, 90, 85), "CS"),
                    new Student(2, "Alice", Arrays.asList(95, 92, 96), "IT"),
                    new Student(3, "Bob", Arrays.asList(40, 55, 60), "CS"),
                    new Student(4, "Carol", Arrays.asList(70, 75, 72), "ECE"),
                    new Student(5, "David", Arrays.asList(88, 91, 84), "CS")
            );


            GradeCalculator gradeCalculator = avg -> {
                if (avg >= 90) return "A";
                else if (avg >= 75) return "B";
                else if (avg >= 50) return "C";
                else return "Fail";
            };

            System.out.println("---- Student Grades ----");


            students.forEach(s -> {
                double avg = s.marks.stream().mapToInt(Integer::intValue).average().orElse(0.0);
                String grade = gradeCalculator.calculateGrade(avg);
                System.out.printf("%s (%s) → Avg = %.2f → Grade %s%n", s.name, s.department, avg, grade);
            });

            System.out.println("\n---- Highest Average Student ----");
            students.stream()
                    .max(Comparator.comparingDouble(s -> s.marks.stream().mapToInt(Integer::intValue).average().orElse(0.0)))
                    .ifPresent(s -> {
                        double avg = s.marks.stream().mapToInt(Integer::intValue).average().orElse(0.0);
                        System.out.printf("%s with Avg = %.2f%n", s.name, avg);
                    });

            System.out.println("\n---- Students in Computer Science ----");
            long csCount = students.stream()
                    .filter(s -> s.department.equalsIgnoreCase("CS"))
                    .count();
            System.out.println("CS Department Student Count: " + csCount);

            System.out.println("\n---- Top 3 Students by Average ----");
            students.stream()
                    .sorted((s1, s2) -> {
                        double avg1 = s1.marks.stream().mapToInt(Integer::intValue).average().orElse(0.0);
                        double avg2 = s2.marks.stream().mapToInt(Integer::intValue).average().orElse(0.0);
                        return Double.compare(avg2, avg1); // descending
                    })
                    .limit(3)
                    .forEach(s -> {
                        double avg = s.marks.stream().mapToInt(Integer::intValue).average().orElse(0.0);
                        String grade = gradeCalculator.calculateGrade(avg);
                        System.out.printf("%s → Avg = %.2f → Grade %s%n", s.name, avg, grade);
                    });
        }
    }
}
