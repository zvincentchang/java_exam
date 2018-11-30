
package BTest809;
import java.sql.*;
import java.util.*;
public class Q06 {
  
    public static void main(String[] args) {
       try{
           Properties ps=new Properties();
           ps.put("user", "root");
           ps.put("password", "1234");
           Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/classicmodels",ps);
           if(cn !=null)
               System.out.println("OK");
       }catch(SQLException ex){
           System.out.println(ex.getMessage());
       }
    }

}
