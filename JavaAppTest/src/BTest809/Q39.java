package BTest809;

import java.sql.*;
public class Q39 {
  
    public static void main(String[] args) {
         try{
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels", "root", "1234");
            String sql="select employeenumber,firstname from employees";
            Statement st=cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE , ResultSet.CONCUR_UPDATABLE);
            ResultSet rs=st.executeQuery(sql);
         
            while(rs.next()){
                if(rs.getInt(1)==1056){
                    rs.updateString(2, "John");
                  //  rs.updateRow();  必須updateRow() 才會寫回資料庫
                }
            }
            rs.absolute(2);
            System.out.println(rs.getInt(1)+":"+rs.getString(2));
        }catch(SQLException ex){
            System.out.println("error:"+ex.getMessage());
        }
    }

}
