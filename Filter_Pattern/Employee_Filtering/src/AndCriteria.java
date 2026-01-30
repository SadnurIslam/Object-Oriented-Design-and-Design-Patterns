import java.util.List;

class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Employee> meetCriteria(List<Employee> employees) {
        List<Employee> firstCriteriaItems = criteria.meetCriteria(employees);
        return otherCriteria.meetCriteria(firstCriteriaItems);
    }
}

