package design_patterns._03_structural._06_flyweight._02_termes_example;

import java.io.Serializable;

public class Warrior extends Termes implements Serializable {
    public Warrior() {
        strength = 10;
        dexterity = 4;
        speed = 6;
    }

    // more code here
}
