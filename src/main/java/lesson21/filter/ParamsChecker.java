package lesson21.filter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

public class ParamsChecker {
  public static boolean check(HttpServletRequest req) {
    String op1s = req.getParameter("op1");
    if (op1s == null || op1s == "") return false;
    String op2s = req.getParameter("op2");
    if (op2s == null || op2s == "") return false;
    String ops = req.getParameter("op");
    if (ops == null || ops == "") return false;
    String ids = req.getParameter("id");
    if (ids == null || ids == "") return false;
    try {
      int op1 = Integer.parseInt(op1s);
      int op2 = Integer.parseInt(op2s);
      int id = Integer.parseInt(ids);
    } catch (NumberFormatException x) {
      return false;
    }
    Optional<Cookie> user = Optional.empty();
    Cookie[] cookies = req.getCookies();
    for (Cookie c: cookies) {
      if (c.getName().equals("%CALC%")) {
        user = Optional.of(c);
        break;
      }
    }

    if (!user.isPresent()) return false;

    return  true;
  }
}
