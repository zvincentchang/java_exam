package ATest809;

import java.util.Locale;
import java.util.ResourceBundle;


public class Q32 {
  
    public static void main(String[] args) {
       Locale locale=new Locale.Builder().setLanguage("en").setRegion("FR").build();
       Locale.setDefault(locale);
       ResourceBundle res=ResourceBundle.getBundle("ATest809.Messages");
       System.out.println(res.getString("msg"));
    }

}
