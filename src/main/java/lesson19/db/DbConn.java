package lesson19.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConn {

  private static Connection conn;

  public static Connection get() throws SQLException {
    if (conn == null) {
      conn = DriverManager.getConnection(
          "jdbc:postgresql://localhost:5432/ibatech",
          "postgres",
          "secret"
//        System.getenv("PG_PWD")
      );
    }
    return conn;
  }
}
