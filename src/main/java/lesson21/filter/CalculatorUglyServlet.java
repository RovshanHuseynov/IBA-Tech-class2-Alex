package lesson21.filter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CalculatorUglyServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String op1s = req.getParameter("op1");
    String op2s = req.getParameter("op2");
    String ops = req.getParameter("op");
    String ids = req.getParameter("id");
    try {
      int op1 = Integer.parseInt(op1s);
      int op2 = Integer.parseInt(op2s);
      int id = Integer.parseInt(ids);
      Cookie[] cookies = req.getCookies();
      for (Cookie c: cookies) {
        System.out.println(c.getName());
        System.out.println(c.getValue());
        System.out.println(c.getMaxAge());
      }
    } catch (NumberFormatException x) {
//      render
      return;
    }
    // .. meaningful things...
    //      render

  }
}
