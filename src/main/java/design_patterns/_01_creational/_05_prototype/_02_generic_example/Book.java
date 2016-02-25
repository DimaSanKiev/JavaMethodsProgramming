package design_patterns._01_creational._05_prototype._02_generic_example;

public class Book extends Issue {
    private String author;

    public Book(Integer id, String author, String name, int year) {
        super(id, name, year);
        this.author = author;
    }
}
