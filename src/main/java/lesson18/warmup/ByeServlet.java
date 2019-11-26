package lesson18.warmup;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ByeServlet extends HttpServlet {

  private DataContainer data;

  public ByeServlet(DataContainer passed_from_the_root_of_app) {
    this.data = passed_from_the_root_of_app;
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String name = "Jim";
    int number = 43;
    // read that file
    // replace $name -> "Jim"
    // replace $number -> 43
    // display that file

    try(PrintWriter w = resp.getWriter()) {
      String name1 = data.getName();
      w.printf("Bye, %s", name1);
    }
  }
}
