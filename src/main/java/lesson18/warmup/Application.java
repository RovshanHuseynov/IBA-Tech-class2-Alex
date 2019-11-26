package lesson18.warmup;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class Application {
  public static void main(String[] args) throws Exception {
    Server server = new Server(9001);
    ServletContextHandler handler = new ServletContextHandler();
    DataContainer data = new DataContainer();

    handler.addServlet(new ServletHolder(new HelloServlet(data)), "/hello/*");
    handler.addServlet(new ServletHolder(new ByeServlet(data)), "/bye/*");

    server.setHandler(handler);
    server.start();
    server.join();
  }
}
