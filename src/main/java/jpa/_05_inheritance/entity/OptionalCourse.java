package jpa._05_inheritance.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.io.Serializable;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("OPTIONAL")
public class OptionalCourse extends Course implements Serializable {
    private static final long serialVersionUID = 5083839470964501370L;

    public OptionalCourse() {
        super();
    }
}
