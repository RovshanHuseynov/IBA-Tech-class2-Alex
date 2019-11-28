package lesson19.db;

import java.sql.SQLException;
import java.util.List;

public class DatabaseApp {
  public static void main(String[] args) throws SQLException {
//    DbOps.insert_user("Mario", "mario@i.ua");
    List<User> users = DbOps.get_all_users();
    users.forEach(u ->
        System.out.printf("%d : %-8s : %s\n",
            u.getId(), u.getName(), u.getEmail()));
  }
}
