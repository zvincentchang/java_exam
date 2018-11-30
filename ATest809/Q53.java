package ATest809;

import java.util.Locale;
import java.util.ResourceBundle;


public class Q53 {
  
    public static void main(String[] args) {
       ResourceBundle res=ResourceBundle.getBundle("ATest809.Greetings",Locale.US);
       System.out.println(res.getObject("HELLO_MSG"));
    }

}
