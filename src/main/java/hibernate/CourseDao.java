package hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Set;

public class CourseDao {
    private Session session;

    public CourseDao(Session session) {
        this.session = session;
    }

    public Set<Student> findRegisteredOnCourse(String courseTitle) {
        Set<Student> registeredOnCourse;
        Query query = session.createQuery("FROM Course WHERE title =: title");
        query.setParameter("title", courseTitle);
        Course course = (Course) query.uniqueResult();
        registeredOnCourse = course.getStudents();
        return registeredOnCourse;
    }

    public boolean addCourse(Course course) {
        boolean flag = false;
        Transaction t = null;
        try {
            t = session.beginTransaction();
            session.saveOrUpdate(course);
            t.commit();
            flag = true;
        } catch (HibernateException e) {
            e.printStackTrace();
            t.rollback();
        }
        return flag;
    }
}
