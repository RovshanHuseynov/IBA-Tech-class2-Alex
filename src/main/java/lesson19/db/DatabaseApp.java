package lesson19.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseApp {
  public static void main(String[] args) throws SQLException {
    Connection conn = DbConn.get();
    String SQLI = "insert into users (name, email) values (?, ?)";
    PreparedStatement stmt = conn.prepareStatement(SQLI);
    stmt.setString(1, "Jack");
    stmt.setString(2, "jack@amazon.com");
    stmt.execute();
  }
}
