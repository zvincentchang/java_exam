
package BTest809;

import java.nio.file.*;


public class Q19 {
  
    public static void main(String[] args) {
       Path p1=Paths.get("/app/./sys");
       Path p2=p1.resolve("log");
       Path p3=Paths.get("/server/exe");
       Path p4=p3.resolve("/readme");
       System.out.println(p2);
         System.out.println(p4);
    }

}
