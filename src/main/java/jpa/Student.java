package jpa;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
