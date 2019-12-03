package lesson21.filter;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

import javax.servlet.DispatcherType;
import java.util.EnumSet;

/**
 * http://localhost:9001/login
 * http://localhost:9001/logout
 * http://localhost:9001/do
 */
public class FilterApp {
  public static void main(String[] args) throws Exception {
    Server server = new Server(9001);

    ServletContextHandler handler = new ServletContextHandler();
    handler.addServlet(LoginServlet.class, "/login/*");
    handler.addServlet(LogoutServlet.class, "/logout/*");
    handler.addServlet(DoServlet.class, "/do/*");
    handler.addServlet(CalculatorUglyServlet.class, "/c1/*");
    handler.addServlet(CalculatorBetterServlet.class, "/c2/*");

    handler.addFilter(CalculatorTheBestServletFilter.class, "/c3/*",
        EnumSet.of(DispatcherType.REQUEST));
    handler.addServlet(CalculatorTheBestServlet.class, "/c3/*");

    server.setHandler(handler);
    server.start();
    server.join();
  }
}
