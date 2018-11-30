/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ATest809;

import java.sql.*;
public class Q19 {
  
    public static void main(String[] args) {
       String url="jdbc:mysql://localhost/classicmodels";
       String user="root";
       String pass="1234";
       try{
           Connection cn=DriverManager.getConnection(url,user,pass);
           Statement st=cn.createStatement();
           ResultSet rs=st.executeQuery("select * from employees");
          
           int id=rs.getInt("employeenumber");
           System.out.println(id);
           
       }catch(SQLException ex){
            System.out.println("error:"+ex.getMessage());
       }
    }

}
