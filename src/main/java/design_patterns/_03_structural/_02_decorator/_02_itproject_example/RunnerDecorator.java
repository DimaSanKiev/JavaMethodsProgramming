package design_patterns._03_structural._02_decorator._02_itproject_example;

public class RunnerDecorator {
    public static void main(String[] args) {
        IEmployee employee = new TesterDecorator(new Employee("Tester"));
        employee.reopenTask();
        employee = new TeamLeadDecorator(new Employee("TeamLead"));
        employee.openTask();
    }
}
