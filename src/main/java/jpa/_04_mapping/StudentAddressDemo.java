package jpa._04_mapping;

import jpa._04_mapping.entity.Address;
import jpa._04_mapping.entity.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class StudentAddressDemo {
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaUniversityOneToOneCascade");
    static EntityManager em = emf.createEntityManager();

    public static void main(String[] args) {
        em.getTransaction().begin();

        Student student = new Student();
        student.setLastName("Reut");
        student.setFirstName("Alex");

        Address address = new Address();
        address.setCity("Prague");
        address.setState("Czech");
        address.setStreet("Ryzarska");
        student.setAddress(address);    // add address to student

        em.persist(student);
        em.flush();
        em.getTransaction().commit();

        Query query = em.createQuery("SELECT s FROM Student s");
        List<Student> list = (List<Student>) query.getResultList();
        for (Student st : list) {
            System.out.println(st.getAddress());
        }
        em.close();
        emf.close();
    }
}
