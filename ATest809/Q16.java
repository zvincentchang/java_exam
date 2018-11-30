
package ATest809;

import java.sql.*;
import java.util.*;
public class Q16 {
  
    public static Connection getConnection(String dbURL, String user, String password)
      throws SQLException, ClassNotFoundException {
    Class.forName("com.mysql.jdbc.Driver");

    Properties props = new Properties();
    props.put("user", user);
    props.put("password", password);

    props.put("autoReconnect", "true");

    return DriverManager.getConnection(dbURL, props);
  }

  public static void main(String[] args) {
    Connection conn = null;
    try {
      conn = getConnection("jdbc:mysql://localhost/classicmodels", "root", "1234");
    } catch (Exception ex) {
      System.out.println("SQLException: " + ex.getMessage());
    }
  }

}
