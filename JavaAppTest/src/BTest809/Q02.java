package BTest809;

import java.io.IOException;
import java.nio.file.*;


public class Q02 {
  
    public static void main(String[] args) throws IOException {
       Path p1=Paths.get("c:/temp/data/test.txt");
       Path p2=Paths.get("c:/temp");
       Files.copy(p1, p2);
    }

}
