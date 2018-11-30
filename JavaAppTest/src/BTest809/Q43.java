package BTest809;

import java.io.*;
import java.nio.file.*;
import java.util.List;
import java.util.stream.Stream;


public class Q43 {
  
    public static void main(String[] args) throws IOException {
       Path file=Paths.get("c:/temp/data.txt");
       List<String> fc=Files.readAllLines(file);
       fc.stream().forEach(s->System.out.println(s));
    }

}
