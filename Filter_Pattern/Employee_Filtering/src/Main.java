import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("John", "Male", "IT"));
        employees.add(new Employee("Jane", "Female", "HR"));
        employees.add(new Employee("Bob", "Male", "Finance"));
        employees.add(new Employee("Alice", "Female", "IT"));
        employees.add(new Employee("Tom", "Male", "IT"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria it = new CriteriaDepartmentIT();
        Criteria maleIT = new AndCriteria(male, it);
        Criteria femaleOrIT = new OrCriteria(female, it);

        System.out.println("Males: ");
        printEmployees(male.meetCriteria(employees));

        System.out.println("\nFemales: ");
        printEmployees(female.meetCriteria(employees));

        System.out.println("\nIT Department: ");
        printEmployees(it.meetCriteria(employees));

        System.out.println("\nMale AND IT: ");
        printEmployees(maleIT.meetCriteria(employees));

        System.out.println("\nFemale OR IT: ");
        printEmployees(femaleOrIT.meetCriteria(employees));
    }

    public static void printEmployees(List<Employee> employees) {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
