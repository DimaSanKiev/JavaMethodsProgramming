package jpa._02_identity;

import java.io.Serializable;

public class StudentPk implements Serializable {
    private String firstName;
    private String lastName;

    // field name and type are the same as in Student class
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // field name and type are the same as in Student class
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // some code here
}
