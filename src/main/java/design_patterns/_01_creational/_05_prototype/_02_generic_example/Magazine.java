package design_patterns._01_creational._05_prototype._02_generic_example;

public class Magazine extends Issue {
    private int number;

    public Magazine(Integer id, int number, String name, int year) {
        super(id, name, year);
        this.number = number;
    }
}
