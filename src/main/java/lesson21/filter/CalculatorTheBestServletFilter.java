package lesson21.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CalculatorTheBestServletFilter implements Filter {
  @Override
  public void init(FilterConfig filterConfig) throws ServletException {}

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    if (ParamsChecker.check((HttpServletRequest) request)) {
      chain.doFilter(request, response);
    } else {
      ((HttpServletResponse)response).sendRedirect("/login");
    }
  }

  @Override
  public void destroy() {}
}
