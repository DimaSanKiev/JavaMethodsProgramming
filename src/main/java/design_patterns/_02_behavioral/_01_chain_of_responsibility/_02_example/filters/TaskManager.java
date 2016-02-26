package design_patterns._02_behavioral._01_chain_of_responsibility._02_example.filters;

import design_patterns._02_behavioral._01_chain_of_responsibility._02_example.Employee;

public class TaskManager extends AbstractHandler {
    public TaskManager() {
        // more code
    }

    @Override
    public void handleRequest(Employee user) {
        assignTask();
    }

    public void assignTask() {
        System.out.println("Assign task");
    }
}
