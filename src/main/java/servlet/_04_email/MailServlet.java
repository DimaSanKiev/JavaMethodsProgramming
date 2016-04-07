package servlet._04_email;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Properties;

@WebServlet("/MailServlet")
public class MailServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // mail server parameters request from mail.properties
        Properties properties = new Properties();
        ServletContext context = getServletContext();
        String filename = context.getInitParameter("mail");

        // loading mail server parameters into property object
        properties.load(context.getResourceAsStream(filename));
        MailThread mailOperator =
                new MailThread(request.getParameter("to"), request.getParameter("subject"),
                        request.getParameter("body"), properties);

        // start sending mail within different thread
        mailOperator.start();

        // redirecting to create new mail page
        request.getRequestDispatcher("/send.jsp").forward(request, response);
    }
}
