package design_patterns._03_structural._02_decorator._02_itproject_example;

public abstract class EmployeeDecorator implements IEmployee {
    protected Employee employee;

    public EmployeeDecorator() {
        super();
    }

    public EmployeeDecorator(Employee employee) {
        this.employee = employee;
    }

    public void openTask() {
        employee.openTask();
    }

    public void reopenTask() {
        employee.reopenTask();
    }

    public void resolveTask() {
        employee.resolveTask();
    }
}
