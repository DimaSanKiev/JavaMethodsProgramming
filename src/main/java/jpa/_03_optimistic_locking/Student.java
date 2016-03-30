package jpa._03_optimistic_locking;

import javax.persistence.*;
import java.io.Serializable;

public class Student implements Serializable {
    // some code here

    private Long id;

    @Version
    @Column(name = "OPTLOCK")
    public Integer getVersion() {
        /* more code */
        return 0;
    }

    private EntityManagerFactory factory;
    private Student student = new Student();

    public void find() {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.find(Student.class, student.getId(), LockModeType.PESSIMISTIC_WRITE);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
