package design_patterns._01_creational._05_prototype._02_generic_example;

import java.util.ArrayList;

public class ProRunner {
    public static void main(String[] args) {
        ArrayList<Issue> issueList = new ArrayList<Issue>() {
            {
                this.add(new Book(615, "Steve McConnell", "Code Complete", 2012));
                this.add(new Book(453, "Bruce Eckel", "Thinking in Java", 2006));
                this.add(new Book(721, "Joshua Bloch", "Effective Java", 2008));
                this.add(new Magazine(1009, 9, "PC Magazine", 2012));
            }
        };
        IssueCacheClient cache = new IssueCacheClient(issueList);
        Issue copy = cache.cloneElementById(453);
        System.out.println(issueList);
        System.out.println(copy);
    }
}
