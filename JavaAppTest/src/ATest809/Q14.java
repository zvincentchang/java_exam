package ATest809;

import java.util.Locale;
import java.util.ResourceBundle;


public class Q14 {
  
    public static void main(String[] args) {
       Locale current;
       current=new Locale("de","DE");
       // current=Locale.GERMANY;
      // current=new Locale.Builder().setLanguage("de").setRegion("DE").build();
              
       ResourceBundle b=ResourceBundle.getBundle("demo/message",current);
       System.out.println(b.getString("inquery"));
    }

}
