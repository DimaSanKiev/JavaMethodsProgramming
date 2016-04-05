package hibernate;

import org.hibernate.Session;

import java.util.HashSet;
import java.util.Set;

public class StudentCourseSimplestDemo {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSession();
        try {
            StudentDao studentDao = new StudentDao(session);
            CourseDao courseDao = new CourseDao(session);

            String courseTitle1 = "Java";
            Course course1 = new Course();
            course1.setTitle(courseTitle1);

            Set<Student> set1 = new HashSet<Student>() {
                {
                    this.add(new Student("Ivanenko", "Ivan"));
                    this.add(new Student("Petrenko", "Petro"));
                    this.add(new Student("Sidorenko", "Sidor"));
                }
            };
            course1.setStudents(set1);
            courseDao.addCourse(course1);

            String courseTitle2 = "Design Patterns for Java";
            Course course2 = new Course();
            course2.setTitle(courseTitle2);
            courseDao.addCourse(course2);
            Set<Student> setRes = courseDao.findRegisteredOnCourse(courseTitle1);
            Student student1 = new Student("Zanko", "Vital");
            studentDao.addStudent(student1);
            System.out.println(setRes);
            Student student2 = studentDao.getStudent("Ivanov")
            System.out.println(student2);
            Set<Student> set2 = new HashSet<>();
            set2.add(student1);
            set2.add(student2);
            course2.setStudents(set2);
            courseDao.addCourse(course2);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
