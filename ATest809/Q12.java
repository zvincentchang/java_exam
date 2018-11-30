package ATest809;

import java.text.NumberFormat;
import java.util.Locale;


public class Q12 {
  
    public static void main(String[] args) {
        double d=15;
        Locale loc=new Locale("en","US");
       // Locale loc=new Locale("zh","TW");
        NumberFormat ft=NumberFormat.getCurrencyInstance(loc);
        System.out.println(ft.format(d));
        
    }

}
