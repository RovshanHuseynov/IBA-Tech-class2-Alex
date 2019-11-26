package lesson18.template;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

/**
 * servlet location:
 * http://localhost:9001/ph
 */
public class TemplateApp01 {
  public static void main(String[] args) throws Exception {
    ServletContextHandler handler = new ServletContextHandler();
    handler.addServlet(PlaceHolderServlet.class, "/ph/*");

    Server server = new Server(9001);
    server.setHandler(handler);
    server.start();
    server.join();
  }
}
