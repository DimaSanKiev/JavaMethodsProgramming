package design_patterns._03_structural._03_facade._01_basic_implementation;

public class Facade implements IFacade {
    private SecuritySystem securitySystem;
    private SubSystem subSystem;

    public Facade() {
        // initialization may be different
        this.subSystem = new SubSystem();
        this.securitySystem = new SecuritySystem();
    }

    @Override
    public void generate() {
        // user and their rights check
        securitySystem.checkUser();
        securitySystem.checkRight();
        // create action
        subSystem.createNode();
    }

    @Override
    public void find() {
        // user and their rights check
        securitySystem.checkUser();
        subSystem.parse();
    }
}
