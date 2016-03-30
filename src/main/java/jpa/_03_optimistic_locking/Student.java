package jpa._03_optimistic_locking;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@NamedQueries({
        @NamedQuery(name = "Student.findAll",
                query = "SELECT s FROM Student s"),
        @NamedQuery(name = "Student.findById",
                query = "SELECT s FROM Student s WHERE s.id = :id"),
        @NamedQuery(name = "Student.findByFirstName",
                query = "SELECT s FROM Student s WHERE s.firstName = :firstName"),
        @NamedQuery(name = "Student.findByLastName",
                query = "SELECT s FROM Student s WHERE s.lastName = :lastName")
})
public class Student implements Serializable {

    private Long id;

    @Version
    @Column(name = "OPTLOCK")
    public Integer getVersion() {
        /* more code */
        return 0;
    }

    private EntityManagerFactory factory;

    public void optimisticLockingDemo() {
        Student student = new Student();
        EntityManager entityManager = factory.createEntityManager();
        entityManager.find(Student.class, student.getId(), LockModeType.PESSIMISTIC_WRITE);
    }

    public void namedQueriesDemo() {
        EntityManager entityManager = factory.createEntityManager();
        String lastName = "testLastName";
        Query query = entityManager.createNamedQuery("Student.findByLastName");
        query.setParameter("lastName", lastName);
        Collection students = query.getResultList();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
