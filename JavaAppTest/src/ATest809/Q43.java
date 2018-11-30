package ATest809;
import java.sql.*;

public class Q43 {
  
    public static void main(String[] args) {
       try{
           Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","1234");
           Statement st=cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE , ResultSet.CONCUR_UPDATABLE);
           System.out.println("Status:"+st.execute("select * from studenttest"));
           ResultSet rs=st.getResultSet();
           rs.absolute(3);
           rs.moveToInsertRow();
           rs.updateInt(1, 113);
           rs.updateString(2, "D");
           rs.updateRow();
          // rs.insertRow();
          // rs.refreshRow();
          
           System.out.println(rs.getInt(1)+":"+rs.getString(2));
       }catch(SQLException ex){
           System.out.println(ex.getMessage());
       }
    }

}
