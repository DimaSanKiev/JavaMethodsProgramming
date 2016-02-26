package design_patterns._02_behavioral._01_chain_of_responsibility._02_example.filters;

import design_patterns._02_behavioral._01_chain_of_responsibility._02_example.Employee;

public class RoleManager extends AbstractHandler {
    public RoleManager() {
    }

    @Override
    public void handleRequest(Employee user) {
        checkPermission();
    }

    public void checkPermission() {
        System.out.println("Checking role");
        // check role
    }
}
