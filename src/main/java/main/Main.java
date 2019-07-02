package main;

import accounts.AccountService;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import servlets.MirrorServlet;

import servlets.SingInServlet;
import servlets.SingUpServlet;

public class Main {
    public static void main(String[] args) throws Exception {
        AccountService accountService = new AccountService();
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.addServlet(new ServletHolder(new MirrorServlet()), "/mirror");
        context.addServlet(new ServletHolder(new SingInServlet(accountService)), "/signin");
        context.addServlet(new ServletHolder(new SingUpServlet(accountService)), "/signup");
        Server server = new Server(8080);
        server.start();
        java.util.logging.Logger.getGlobal().info("Server started");
        server.join();
    }
}
