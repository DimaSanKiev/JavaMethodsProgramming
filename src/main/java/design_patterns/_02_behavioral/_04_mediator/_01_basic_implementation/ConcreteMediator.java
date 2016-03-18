package design_patterns._02_behavioral._04_mediator._01_basic_implementation;

public class ConcreteMediator implements Mediator {
    private ConcreteColleagueOne colleagueOne;
    private ConcreteColleagueTwo colleagueTwo;

    public ConcreteMediator() {
        colleagueOne = new ConcreteColleagueOne();
        colleagueTwo = new ConcreteColleagueTwo();
    }

    @Override
    public void setTrue() {
        colleagueOne.changeFlag(true);
        colleagueTwo.changeFlag(true);
        System.out.println("Both set to true.");
    }

    @Override
    public void setFalse() {
        colleagueOne.changeFlag(false);
        colleagueTwo.changeFlag(false);
        System.out.println("Both set to false.");
    }

    @Override
    public void setDifferent() {
        colleagueOne.changeFlag(true);
        colleagueTwo.changeFlag(false);
        System.out.println("First - true, second - false.");
    }
}
