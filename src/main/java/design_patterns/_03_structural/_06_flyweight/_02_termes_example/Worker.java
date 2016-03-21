package design_patterns._03_structural._06_flyweight._02_termes_example;

import java.io.Serializable;

public class Worker extends Termes implements Serializable {
    public Worker() {
        strength = 6;
        dexterity = 9;
        speed = 10;
    }

    // more code here
}
