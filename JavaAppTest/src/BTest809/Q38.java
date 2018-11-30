package BTest809;
import java.sql.*;

public class Q38 {
  
    public static void main(String[] args) {
        
        try{
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels", "root", "1234");
            String sql="select employeenumber from employees";
            Statement st=cn.createStatement();
           
            st.setMaxRows(2);
            st.executeQuery(sql);
            ResultSet rs=st.getResultSet();
            // ResultSet rs=st.executeQuery(sql);
            rs.absolute(3);
            while(rs.next()){
                System.out.println(rs.getInt(1));
            }
        }catch(SQLException ex){
            System.out.println("error:"+ex.getMessage());
        }
    }

}
