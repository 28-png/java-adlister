import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.Integer.parseInt;

@WebServlet(name = "CountServlet", urlPatterns = "/hello-world/counter")
public class CountServlet extends HttpServlet {
    Integer count = 0;
    String resetCount;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
            count++;
            resetCount = req.getParameter("reset");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        if(resetCount != null) {
            count = 0;
           out.println("<h1>Hello, World!</h1>" +
                    "Page Count: " + count + "!" + "<br>");
        } else {
            out.println("<h1>Hello, World!</h1>" +
                    "Page Count: " + count + "!" + "<br>");
        }

    }

}
