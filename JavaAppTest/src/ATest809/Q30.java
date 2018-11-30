package ATest809;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
public class Q30 {
  
    public static void main(String[] args) {
       try{
           List<String> content=Files.readAllLines(Paths.get("c:/temp/data.txt"));
           content.stream().forEach(line->{
               try{
                   Files.write(Paths.get("c:/temp/all.txt"), line.getBytes(), StandardOpenOption.APPEND);
               }catch(IOException ex1){
                   System.out.println("Exception 1");
               }
           });
       }catch(IOException ex2){
           System.out.println("Exception 2");
       }
    }

}
