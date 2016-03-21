package design_patterns._03_structural._06_flyweight._02_termes_example;

import java.io.Serializable;

// flyweight
public class EuTermes implements Serializable {
    // inner part
    private Termes ant;

    // outer state: begin
    private int health;
    private float xCoord;
    private float yCoord;
    private float zCoord;
    // outer state: end


    public EuTermes(String type, float xCoord, float yCoord, float zCoord) {
        this.ant = TermesFactory.getClassFromFactory(type);
        health = 180;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.zCoord = zCoord;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public float getxCoord() {
        return xCoord;
    }

    public void setxCoord(float xCoord) {
        this.xCoord = xCoord;
    }

    public float getyCoord() {
        return yCoord;
    }

    public void setyCoord(float yCoord) {
        this.yCoord = yCoord;
    }

    public float getzCoord() {
        return zCoord;
    }

    public void setzCoord(float zCoord) {
        this.zCoord = zCoord;
    }

    public void go() {
        // more code here
    }

    public void fight() {
        // more code here
    }
}
