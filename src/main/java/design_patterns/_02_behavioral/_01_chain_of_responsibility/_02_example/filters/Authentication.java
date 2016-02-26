package design_patterns._02_behavioral._01_chain_of_responsibility._02_example.filters;

import design_patterns._02_behavioral._01_chain_of_responsibility._02_example.Employee;

public class Authentication extends AbstractHandler {
    public Authentication() {
        // more code
    }

    @Override
    public void handleRequest(Employee user) {
        if (checkStatus(user)) {
            // some code here
        }
    }

    public boolean checkStatus(Employee user) {
        boolean flag = true;
        System.out.println(user);
        System.out.println("Check user status");
        // check user status
        return flag;
    }
}
