package ATest809;

import java.time.Instant;
import java.time.temporal.ChronoUnit;


public class Q55 {
  
    public static void main(String[] args) throws InterruptedException {
       Instant login=Instant.now();
       Thread.sleep(1000);
       Instant logout=Instant.now();
        System.out.println(login);
         System.out.println(logout);
       login=login.truncatedTo(ChronoUnit.MINUTES);
       logout=logout.truncatedTo(ChronoUnit.MINUTES);
         System.out.println(login);
         System.out.println(logout);
       if(logout.isAfter(login))
           System.out.println("Loggged out:"+logout);
       else
           System.out.println("Can't Logout");
    }

}
