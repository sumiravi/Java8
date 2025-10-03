
import java.util.*;
import java.util.stream.*;

@FunctionalInterface
    interface BonusCalculator {
        double calculate(double salary);
    }



    class Employee {
        int id;
        String name;
        double salary;
        String department;

        Employee(int id, String name, double salary, String department) {
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.department = department;
        }

        @Override
        public String toString() {
            return id + " - " + name + " - " + salary + " - " + department;
        }
    }

    public class employeebonusdmo {
        public static void main(String[] args) {
            List<Employee> employees = Arrays.asList(
                    new Employee(101, "Alice", 50000, "IT"),
                    new Employee(102, "Bob", 60000, "HR"),
                    new Employee(103, "Charlie", 70000, "Finance"),
                    new Employee(104, "David", 80000, "IT"),
                    new Employee(105, "Eva", 90000, "Finance")
            );



            BonusCalculator bonusCalc = salary -> salary * 0.10;  // 10% bonus



            System.out.println("Employees with Bonus:");
            employees.stream()
                    .map(emp -> emp.name + " | Salary: " + emp.salary +
                            " | Bonus: " + bonusCalc.calculate(emp.salary))
                    .forEach(System.out::println);



            Employee maxSalaryEmp = employees.stream()
                    .reduce((e1, e2) -> e1.salary > e2.salary ? e1 : e2)
                    .orElse(null);

            System.out.println("\nEmployee with Max Salary: " + maxSalaryEmp);



            Employee minSalaryEmp = employees.stream()
                    .reduce((e1, e2) -> e1.salary < e2.salary ? e1 : e2)
                    .orElse(null);

            System.out.println("Employee with Min Salary: " + minSalaryEmp);


            System.out.println("\nEmployees Grouped by Department:");
            Map<String, List<Employee>> groupByDept = employees.stream()
                    .collect(Collectors.groupingBy(emp -> emp.department));

            groupByDept.forEach((dept, empList) -> {
                System.out.println(dept + " : " + empList);
            });
        }
    }

