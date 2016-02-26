package design_patterns._02_behavioral._01_chain_of_responsibility._02_example;

import design_patterns._02_behavioral._01_chain_of_responsibility._02_example.filters.Authentication;
import design_patterns._02_behavioral._01_chain_of_responsibility._02_example.filters.RoleManager;
import design_patterns._02_behavioral._01_chain_of_responsibility._02_example.filters.TaskManager;

public class ChainDemo {
    public static void main(String[] args) {
        Employee user = new Employee(30, "user", "passwordUser");
        // chain configuration
        RoleManager rm = new RoleManager();
        Authentication auth = new Authentication();
        TaskManager tm = new TaskManager();
        auth.setSuccessor(rm);
        rm.setSuccessor(tm);
        System.out.println("----chain--start----");
        auth.chain(user);
    }
}
