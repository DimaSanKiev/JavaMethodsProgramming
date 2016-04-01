package jpa._04_mapping;

import jpa._04_mapping.entity.Course;
import jpa._04_mapping.entity.Student;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentCourseDemo {
    private static final String PERSISTENCE_UNIT_NAME = "UniversityJpaManyToMany";

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        CourseStudentDao dao = new CourseStudentDao(factory);

        // creating Student object
        Student student = new Student();
        student.setFirstName("Varvara");
        student.setLastName("Timofeeva");

        // creating Course object
        Course course = new Course();
        course.setLecturer("Blinov");
        course.setName("Code Engineering");

        dao.createDemoStudent(student, course);
        dao.loadStudentsByLastName("Timofeeva");
        dao.closeManager();

        if (factory != null && factory.isOpen()) {
            factory.close();
        }
    }
}
