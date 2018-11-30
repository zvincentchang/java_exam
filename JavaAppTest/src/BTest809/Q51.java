package BTest809;

import java.nio.file.Path;
import java.nio.file.Paths;


public class Q51 {
  
    public static void main(String[] args) {
        Path p1=Paths.get("/Pics/MyPic.jpeg");
        System.out.println(p1.getNameCount());
        System.out.println(p1.getName(1));
        System.out.println(p1.getFileName());
    }

}
