
package ATest809;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Q48 {
  
    public static void main(String[] args) {
       ZoneId zone=ZoneId.of("America/New_York");
       ZonedDateTime dt=ZonedDateTime.of(LocalDate.of(2015, 3, 8), LocalTime.of(1,0),zone);
       ZonedDateTime dt2=dt.plusHours(2);
          System.out.println(dt);
        System.out.println(dt2);
       System.out.print(DateTimeFormatter.ofPattern("H:mm -").format(dt2));
       System.out.println("diff:"+ChronoUnit.HOURS.between(dt, dt2));
    }

}
