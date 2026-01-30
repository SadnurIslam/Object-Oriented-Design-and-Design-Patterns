import java.util.ArrayList;
import java.util.List;

class CriteriaFemale implements Criteria {
    @Override
    public List<Employee> meetCriteria(List<Employee> employees) {
        List<Employee> femaleEmployees = new ArrayList<>();
        for (Employee e : employees) {
            if (e.getGender().equalsIgnoreCase("Female")) {
                femaleEmployees.add(e);
            }
        }
        return femaleEmployees;
    }
}