import java.util.ArrayList;
import java.util.List;

class CriteriaDepartmentIT implements Criteria {
    @Override
    public List<Employee> meetCriteria(List<Employee> employees) {
        List<Employee> itEmployees = new ArrayList<>();
        for (Employee e : employees) {
            if (e.getDepartment().equalsIgnoreCase("IT")) {
                itEmployees.add(e);
            }
        }
        return itEmployees;
    }
}