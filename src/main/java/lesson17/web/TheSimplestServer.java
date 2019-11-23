package lesson17.web;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import javax.servlet.http.HttpServlet;

public class TheSimplestServer {
  public static void main(String[] args) throws Exception {
    Server server = new Server(9001);

    ServletContextHandler handler = new ServletContextHandler();
    handler.addServlet(HelloServlet.class, "/hello/*");

    Auth auth = new AuthHash();
    HttpServlet login = new LoginServlet(auth);
    handler.addServlet(new ServletHolder(login), "/login/*");

    handler.addServlet(HelpServlet.class, "/help/*");
    handler.addServlet(FileServlet.class, "/*");
//    handler.addServlet(Servlet404.class, "/*");
    server.setHandler(handler);
    server.start();
    server.join();
  }
}
