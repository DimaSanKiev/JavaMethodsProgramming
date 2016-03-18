package design_patterns._02_behavioral._09_template_method._02_example;

public abstract class AbstractFramework {
    public AbstractFramework() {
    }

    // methods that specify contract for subclasses
    protected abstract boolean check(User user);

    protected abstract ListPermission getAvailablePermissions();

    // general algorithm define
    public void templateMethodLogin(User user) {    // template method
        int count = 0;
        // subclasses overridden methods call
        while (!check(user)) {
            if (++count == 3) {
                System.out.println("access denied for " + user);
                return;
            }
        }
        // getting permissions list available to current user
        ListPermission list = getAvailablePermissions();
    }
}
