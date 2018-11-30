package ATest809;

import java.time.LocalTime;
import static java.time.temporal.ChronoUnit.HOURS;
import static java.time.temporal.ChronoUnit.MINUTES;



public class Q42 {
  
    public static void main(String[] args) {
       LocalTime now=LocalTime.of(6, 30);
       long timeToBK=0;
       LocalTime office_start=LocalTime.of(7,30);
       if(office_start.isAfter(now)){
           timeToBK=now.until(office_start, MINUTES);       
       }
       else
            timeToBK=now.until(office_start, HOURS);    
       System.out.println(timeToBK);
    }

}
