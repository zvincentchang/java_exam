
package BTest809;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


public class Q57 {
  
    public static void main(String[] args) throws IOException {
       Path src=Paths.get("c:/temp/data/data.txt");
       Path dest=Paths.get("c:/temp/data2/data2.txt");
       Files.move(src, dest, StandardCopyOption.ATOMIC_MOVE);
       Files.delete(src);
    }

}
