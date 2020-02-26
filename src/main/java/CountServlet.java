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
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
            count++;
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
            out.println("<h1>Hello, World!</h1>" +
                    "Page Count: " + count + "!" + "<br>");
    }

}
