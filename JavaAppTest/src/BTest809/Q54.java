package BTest809;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class Q54 {
  
    public static void main(String[] args) {
       Stream<Path> paths=Stream.of(Paths.get("data.doc"),Paths.get("c:/temp/data.txt"),Paths.get("data.xml"));
       paths.filter(s->s.toString().endsWith("txt")).forEach(s->{
           try{
               Files.readAllLines(s).stream().forEach(System.out::println);
           }catch(IOException ex){
               System.out.println("error:"+ex.getMessage());
           }
       });
    }

}
