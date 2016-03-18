package design_patterns._02_behavioral._09_template_method._02_example;

// there could be several classes with concrete behaviour
public class BaseFramework extends AbstractFramework {
    // concrete behaviour

    @Override
    protected boolean check(User user) {
        System.out.println("check user");
        return true;
    }

    @Override
    protected ListPermission getAvailablePermissions() {
        ListPermission permissions = new ListPermission();
        // get user's permissions list
        System.out.println("list of user permissions");
        return permissions;
    }
}
