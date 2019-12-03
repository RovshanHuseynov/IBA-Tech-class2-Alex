package lesson21.filter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CalculatorTheBestServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String ops = req.getParameter("op");
    Integer op1 = Integer.parseInt(req.getParameter("op1"));
    Integer op2 = Integer.parseInt(req.getParameter("op2"));
    // .. meaningful things...
    //      render
  }
}
