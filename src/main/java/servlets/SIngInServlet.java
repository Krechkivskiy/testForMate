package servlets;


import accounts.AccountService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SIngInServlet extends HttpServlet {
    AccountService myAccountService;

    public SIngInServlet(AccountService myAccountService) {
        this.myAccountService = myAccountService;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if (myAccountService.getUserByLogin(req.getParameter("login"))!=null) {
            resp.setStatus(200);
            resp.getWriter().write("Authorized: "+req.getParameter("login"));
        } else {
            resp.setStatus(401);
            resp.getWriter().write("Unauthorized");
        }
    }
}
