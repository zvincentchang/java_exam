
package ATest809;

import java.nio.file.*;


public class Q33 {
  
    public static void main(String[] args) {
       Path p1=Paths.get("/software/././sys/readme.txt");
       Path p2=p1.normalize();
       Path p3=p2.relativize(p1);
       System.out.println(p1.getNameCount());
       System.out.println(p2.getNameCount());
       System.out.println(p3.getNameCount());
         System.out.println(p1);
       System.out.println(p2);
       System.out.println(p3);
       
    }

}
