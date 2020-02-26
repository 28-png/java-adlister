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
    String name;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
           PrintWriter out = res.getWriter();
            name = req.getParameter("name");
            if(name != null) {
                out.println("<h1>Hello, World!</h1>" +
                        "Hello " + name + "!" + "<br>");
            } else {
               out.println("<h1>Hello, World!</h1>" + "<br>"
                            + "Hello Unnamed" + "<br>");
            }

    }

}
