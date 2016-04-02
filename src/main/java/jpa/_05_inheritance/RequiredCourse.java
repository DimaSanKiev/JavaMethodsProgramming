package jpa._05_inheritance;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("REQUIRED")
public class RequiredCourse extends Course implements Serializable {
    private static final long serialVersionUID = -6490784821597239150L;

    @Column(name = "mark")
    private int mark;

    public RequiredCourse() {
        super();
    }

    public RequiredCourse(int mark) {
        super();
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "RequiredCourse{" +
                "mark=" + mark +
                '}';
    }
}
