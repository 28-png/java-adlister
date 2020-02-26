import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;


@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello-world")



public class HelloWorldServlet extends HttpServlet {
    Integer currentPage;
    String sortBy;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
            if(sortBy != null) {
                sortBy = req.getParameter("sort");
            }

            if(currentPage != null) {
         currentPage = parseInt(req.getParameter("page"));
            }

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
         out.println("<h1>Hello, World!</h1>" +
                 "Hello " + sortBy + "!" + "<br>" +
                 "Page: " + currentPage);
    }
}
