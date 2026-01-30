import java.util.ArrayList;
import java.util.List;

class CriteriaMale implements Criteria {
    @Override
    public List<Employee> meetCriteria(List<Employee> employees) {
        List<Employee> maleEmployees = new ArrayList<>();
        for (Employee e : employees) {
            if (e.getGender().equalsIgnoreCase("Male")) {
                maleEmployees.add(e);
            }
        }
        return maleEmployees;
    }
}




