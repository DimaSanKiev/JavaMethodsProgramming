package jpa._04_mapping.dao;

import jpa._04_mapping.entity.Course;
import jpa._04_mapping.entity.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class CourseStudentDao {
    private EntityManager entityManager;

    public CourseStudentDao(EntityManagerFactory factory) {
        entityManager = factory.createEntityManager();
    }

    // creating, mapping and persisting demo
    public void createDemoStudent(Student student, Course course) {
        EntityTransaction transaction = null;
        try {
            transaction = entityManager.getTransaction();
            transaction.begin();
            List<Student> students = new ArrayList<>();
            List<Course> courses = new ArrayList<>();

            // mapping student and course
            students.add(student);
            courses.add(course);
            course.setStudents(students);
            student.setCourses(courses);

            // persisting student into database
            entityManager.persist(student);
            transaction.commit();
        } catch (final Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    /**
     * named query: output of students with specified last name
     *
     * @param lastName - last name is query parameter
     */
    public void loadStudentsByLastName(String lastName) {
        // creating named query object
        Query query = entityManager.createNamedQuery("studentByLastName");
        // assigning parameter lastName
        query.setParameter("lastName", lastName);
        // executing query
        List<Student> studentList = (List<Student>) query.getResultList();
        // output results
        if (studentList.size() == 0) {
            System.out.println("Student " + lastName + " not found.");
        }
        for (Student s : studentList) {
            System.out.println(s.getFirstName() + " " + s.getLastName() + ", N" + s.getId());
            System.out.println("Courses:");
            for (Course sCourse : s.getCourses()) {
                System.out.println("\t\"" + sCourse.getName() + "\" by "
                        + sCourse.getLecturer() + ", "
                        + sCourse.getStudents().size() + " students.");
            }
        }
    }

    public void closeManager() {
        if (entityManager != null && entityManager.isOpen()) {
            entityManager.close();
        }
    }
}
