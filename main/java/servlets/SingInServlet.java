package servlets;

import dao.UserDao;
import model.UserModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SingInServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDao userDao = new UserDao();
        UserModel userModel = userDao.checkIsPresent(request.getParameter("login"));

        if (userModel!=null) {
            response.setStatus(HttpServletResponse.SC_OK);
            response.getWriter().write("Authorized: "+userModel.getLogin());
        } else {
            response.setStatus(401);
            response.getWriter().write("Unauthorized");
        }
    }
}
