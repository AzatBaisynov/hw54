import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/output")
public class OutputServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("flogin");
        String pass = req.getParameter("fpass");
        String email = req.getParameter("femail");
        String sexuality = req.getParameter("fsexuality");


        User user = new User(login, pass, email, sexuality);


        req.setAttribute("fflogin",user.getLogin());
        req.setAttribute("ffpass", user.getPass());
        req.setAttribute("ffemail", user.getEmail());
        req.setAttribute("ffsexuality", user.getSexuality());

        req.getRequestDispatcher("/view.jsp").forward(req, resp);

    }
}
