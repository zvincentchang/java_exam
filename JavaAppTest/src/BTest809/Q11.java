package BTest809;
import java.sql.*;

public class Q11 {
   static Connection cn=null;
    static Connection getDBConnection() throws SQLException{
        String url="jdbc:mysql://localhost/classicmodels";
        try(Connection con=DriverManager.getConnection(url,"root","1234")){
             cn=con;
        }
        return cn;
    }
    public static void main(String[] args) throws SQLException{
       getDBConnection();
       Statement st=cn.createStatement();
       st.executeUpdate("insert into demo values(102,'Keven')");
    }

}
