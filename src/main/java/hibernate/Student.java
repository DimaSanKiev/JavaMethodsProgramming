package hibernate;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = ("student"))
@NamedQuery(name = "findStudentByLastName",
        query = "SELECT s FROM Student s WHERE s.lastName = :lastName")
public class Student implements Serializable {
    private static final long serialVersionUID = -3460023937279008031L;

    @Id
    @GenericGenerator(name = "auto_inc", strategy = "increment")
    @GeneratedValue(generator = "auto_inc")
    @Column(name = ("ID"))
    private Long id;

    @Column(name = ("LAST_NAME"))
    private String lastName;

    @Column(name = ("FIRST_NAME"))
    private String firstName;

    public Student() {
        /* more code */
    }

    public Student(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
