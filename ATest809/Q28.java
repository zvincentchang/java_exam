package ATest809;
import java.sql.*;

public class Q28 {
  
    public static void main(String[] args) {
       try{
           Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","1234");
           Statement st=cn.createStatement();
           System.out.println("Status:"+st.execute("delete from studenttest where id=103"));
           
       }catch(SQLException ex){
           
       }
    }

}
