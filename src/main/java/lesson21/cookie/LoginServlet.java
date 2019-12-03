package lesson21.cookie;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * http://localhost:9001/login
 * http://localhost:9001/logout
 * http://localhost:9001/do
 */
public class LoginServlet extends HttpServlet implements MyConsts {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    int user_id = 42;
    Cookie c = new Cookie(COOKIE_NAME, Integer.toString(user_id));
    resp.addCookie(c);
  }
}
