package design_patterns._03_structural._02_decorator._02_itproject_example;

public class TeamLeadDecorator extends EmployeeDecorator {
    // fields and methods

    public TeamLeadDecorator(Employee employee) {
        super(employee);
    }

    @Override
    public void openTask() {
        super.openTask();
        assignTask();
    }

    @Override
    public void reopenTask() {
        super.reopenTask();
        changeEmployee();
    }

    @Override
    public void resolveTask() {
        super.resolveTask();
        closeTask();
    }

    public void assignTask() {
        System.out.println(employee.getName() + " is assigning task");
    }

    public void changeEmployee() {
        System.out.println(employee.getName() + " is changing employee");
    }

    public void closeTask() {
        System.out.println(employee.getName() + " is closing task");
    }
}
