package lesson18;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class Application {
  public static void main(String[] args) throws Exception {
    TemplateEngine engine = new TemplateEngine("./content/templates");

    ServletContextHandler handler = new ServletContextHandler();
    handler.addServlet(PlaceHolderServlet.class, "/ph/*");
    handler.addServlet(new ServletHolder(new FreemarkerServlet(engine)), "/fm/*");

    Server server = new Server(9001);
    server.setHandler(handler);
    server.start();
    server.join();
  }
}
