package design_patterns._03_structural._02_decorator._02_itproject_example;

public class TesterDecorator extends EmployeeDecorator {
    // fields and methods

    public TesterDecorator(Employee employee) {
        super(employee);
    }

    @Override
    public void openTask() {
        super.openTask();
        testing();
    }

    @Override
    public void reopenTask() {
        super.reopenTask();
        testing();
    }

    @Override
    public void resolveTask() {
        reporting();
        super.resolveTask();
    }

    public void reporting() {
        System.out.println(employee.getName() + " create report");
    }

    public void testing() {
        System.out.println(employee.getName() + " testing task");
    }
}
