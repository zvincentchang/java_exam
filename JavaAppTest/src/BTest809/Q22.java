package BTest809;

import java.nio.file.Files;
import java.nio.file.*;
import java.util.stream.Stream;
import java.io.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Q22 {
  
    public static void main(String[] args) throws Exception {
       Stream<Path> files=Files.walk(Paths.get(System.getProperty("user.home")));
       files.forEach(fName->{
           try{
               Path aPath=fName.toAbsolutePath();
               System.out.println(fName+":"+Files.readAttributes(aPath, BasicFileAttributes.class).creationTime());
           }catch(IOException ex){
               ex.printStackTrace();
           }
       });
    }

}
