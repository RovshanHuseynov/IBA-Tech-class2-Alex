package lesson21.cookie;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

/**
 * http://localhost:9001/login
 * http://localhost:9001/logout
 * http://localhost:9001/do
 */
public class CookieApp {
  public static void main(String[] args) throws Exception {
    Server server = new Server(9001);

    ServletContextHandler handler = new ServletContextHandler();
    handler.addServlet(LoginServlet.class, "/login/*");
    handler.addServlet(LogoutServlet.class, "/logout/*");
    handler.addServlet(DoServlet.class, "/do/*");

    server.setHandler(handler);
    server.start();
    server.join();
  }
}
