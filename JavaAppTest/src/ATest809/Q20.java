
package ATest809;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Q20 {
  
    public static void main(String[] args) throws IOException {
       Path p1=Paths.get("c:/temp/data/test.txt");
       Path p2=Paths.get("c:/temp");
       Files.copy(p1, p2);
    }

}
