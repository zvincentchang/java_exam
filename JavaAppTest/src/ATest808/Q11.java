
package ATest808;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;


public class Q11 {
  
    public static void main(String[] args) {
       LocalDate d1=LocalDate.now() ;
       LocalDate d2=LocalDate.of(2018, 7,23) ;
         LocalDate d3=LocalDate.parse("2018-06-20",DateTimeFormatter.ISO_DATE) ;
       System.out.println(d1);
        System.out.println(d2);
          System.out.println(d3);
    }

}
