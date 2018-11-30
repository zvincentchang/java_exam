package ATest809;

import java.io.Console;


public class Q02 {
  
    public static void main(String[] args) {
       Console con=System.console();
       char[ ] pass=con.readPassword("Enter Pass:");
       String p=new String(pass);
       System.out.println(p);
       
    }

}
