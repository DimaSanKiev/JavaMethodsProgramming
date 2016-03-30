package jpa._01_basic.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "student", uniqueConstraints = {@UniqueConstraint(columnNames = {"LAST_NAME"})})
public class Student implements Serializable {
    @Id
    private Long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    // using default Address mapping
    private Address homeAddress;

    // overriding Country mapping
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "iso2", column = @Column(name = "bornIso2")),
            @AttributeOverride(name = "name", column = @Column(name = "bornCountryName"))
    })
    private Country bornIn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Country getBornIn() {
        return bornIn;
    }

    public void setBornIn(Country bornIn) {
        this.bornIn = bornIn;
    }
}
