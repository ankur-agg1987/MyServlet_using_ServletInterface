package a.b;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author Ankur-Agg
 */
public class MyServlet implements Servlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
      }

    @Override
    public ServletConfig getServletConfig() {
        return null;
     }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String u = req.getParameter("username");
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.println("Thanks for submiting the data :"+u);
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
    }

    
}
