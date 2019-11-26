package lesson18;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.HashMap;

public class FreemarkerServlet extends HttpServlet {

  private TemplateEngine engine;

  public FreemarkerServlet(TemplateEngine engine) {
    this.engine = engine;
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String jim = "Jim";
    Dog jack = new Dog(33, "Jack");


    HashMap<String, Object> data = new HashMap<>();
    data.put("name", jim);
    data.put("dog", jack);
    engine.render("one.ftl", data, resp);
  }
}
