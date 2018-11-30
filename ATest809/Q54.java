
package ATest809;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class Q54 {
  
    public static void main(String[] args) throws IOException {        
       Stream<Path>  stream=Files.find(Paths.get("c:/temp/data"), 1, (p,b)-> b.isDirectory()  , FileVisitOption.FOLLOW_LINKS);
       stream.forEach(s->System.out.println(s));
       
    }

}
