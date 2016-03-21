package design_patterns._03_structural._06_flyweight._02_termes_example;

import java.util.ArrayList;
import java.util.List;

public class FlyweightRunner {
    private final static int SIZE = 10_000_000;

    public static void main(String[] args) {
        List<EuTermes> legion = new ArrayList<>();
        int i = 0;
        try {
            for (i = 0; i < SIZE; i++) {
                legion.add(new EuTermes("Worker", 12.3f, 10.1f, 5.0f));
            }
        } catch (OutOfMemoryError e) {
            System.err.println("OutOfMemoryError for Termes Worker");
        } finally {
            System.out.println("Instance: " + i);
        }
    }
}
