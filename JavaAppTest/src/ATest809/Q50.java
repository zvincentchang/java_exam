
package ATest809;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class Q50 {
  
    public static void main(String[] args) throws Exception {
       Stream<String> lines=Files.lines(Paths.get("c:/temp/data.txt"));
       lines.forEach(c->System.out.print(c));
    }

}
