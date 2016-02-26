package design_patterns._02_behavioral._01_chain_of_responsibility._02_example.filters;

import design_patterns._02_behavioral._01_chain_of_responsibility._02_example.Employee;
import design_patterns._02_behavioral._01_chain_of_responsibility._02_example.MapEmployee;

public abstract class AbstractHandler {
    protected MapEmployee db;
    protected AbstractHandler successor = DefaultHandleRequest.getHandleRequest();

    public AbstractHandler(AbstractHandler successor) {
        this.db = new MapEmployee();
        this.successor = successor;
    }

    public AbstractHandler() {
        this.db = new MapEmployee();
    }

    public void setSuccessor(AbstractHandler successor) {
        this.successor = successor;
    }

    abstract public void handleRequest(Employee employee);

    public void chain(Employee user) {
        if (db.containsUser(user)) {
            handleRequest(user);
            successor.chain(user);
        } else {
            System.out.println("User doesn't exist.");
        }
    }

    private static class DefaultHandleRequest extends AbstractHandler {
        private static DefaultHandleRequest handler = new DefaultHandleRequest();

        private DefaultHandleRequest() {
        }

        public static DefaultHandleRequest getHandleRequest() {
            return handler;
        }

        @Override
        public void chain(Employee user) {
            // always empty
        }

        @Override
        public void handleRequest(Employee employee) {
            // default handler if exists
        }
    }
}
