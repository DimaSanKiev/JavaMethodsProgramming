package jpa._01_basic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class StudentServlet extends HttpServlet {
    @PersistenceUnit(unitName = "UniversityDB")
    private EntityManagerFactory factory;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EntityManager em = factory.createEntityManager();
        try {
            List studentList = em.createQuery("SELECT s FROM Student s").getResultList();
            request.setAttribute("students", studentList);
            getServletContext().getRequestDispatcher("/jsp/list_students.jsp")
                    .forward(request, response);
        } finally {
            em.close();
        }
    }
}
