import java.util.List;

class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Employee> meetCriteria(List<Employee> employees) {
        List<Employee> firstCriteriaItems = criteria.meetCriteria(employees);
        List<Employee> otherCriteriaItems = otherCriteria.meetCriteria(employees);

        for (Employee e : otherCriteriaItems) {
            if (!firstCriteriaItems.contains(e)) {
                firstCriteriaItems.add(e);
            }
        }
        return firstCriteriaItems;
    }
}
