package lesson21.cookie;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

/**
 * http://localhost:9001/login
 * http://localhost:9001/logout
 * http://localhost:9001/do
 */
public class DoServlet extends HttpServlet implements MyConsts {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    Cookie[] cookies = req.getCookies();
    Optional<Cookie> user = Optional.empty();
    for (Cookie c: cookies) {
      if (c.getName().equals(COOKIE_NAME)) {
        user = Optional.of(c);
      }
    }

    System.out.println(
        user // Optional<Cookie>
          .map(c -> c.getValue())
          .map(s -> Integer.valueOf(s))
          .orElse(-13)
    );
  }
}
