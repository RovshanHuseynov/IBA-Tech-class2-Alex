package lesson20.calc;

import lesson19.db.DbOps;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CalculatorServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String op1s = req.getParameter("op1");
    String op2s = req.getParameter("op2");
    String ops = req.getParameter("op");
    String ids = req.getParameter("id");

    Cookie[] cookies = req.getCookies();
    for (Cookie c: cookies) {
      System.out.println(c.getName());
      System.out.println(c.getValue());
      System.out.println(c.getMaxAge());
    }

    int op1 = Integer.parseInt(op1s);
    int op2 = Integer.parseInt(op2s);
    int id = Integer.parseInt(ids);
    int r = Calc20.do_op(op1, op2, ops);
    DbOps.insert_op(op1, op2, ops, r, id);

    Cookie c = new Cookie("MY_SUPERID", "013");
    c.setMaxAge(0);
    resp.addCookie(c);

  }
}
