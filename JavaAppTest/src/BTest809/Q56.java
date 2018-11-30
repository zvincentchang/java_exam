package BTest809;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class Q56 {
  
    public static void main(String[] args) throws IOException {
       Stream<Path> paths=Files.find(Paths.get("c:/temp"),2
               , (p,a)-> p.getFileName().toString().endsWith("txt"), FileVisitOption.FOLLOW_LINKS );
       Long fCount=paths.count();
       System.out.println(fCount);
    }

}
