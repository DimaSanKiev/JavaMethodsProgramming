package jpa._04_mapping;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "COURSE")
public class Course implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "LECTOR")
    private String lector;

    @Enumerated(value = EnumType.STRING)
    private TypeCourse type = TypeCourse.OPTIONAL;

    // reversal many-to-many relationship mapping
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "courses")
    private List<Student> students;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLector() {
        return lector;
    }

    public void setLector(String lector) {
        this.lector = lector;
    }

    public TypeCourse getType() {
        return type;
    }

    public void setType(TypeCourse type) {
        this.type = type;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lector='" + lector + '\'' +
                ", type=" + type +
                ", students=" + students +
                '}';
    }
}
