package BTest809;

import java.io.*;
import java.nio.file.*;
import java.util.List;

public class Q07 {

    public static void main(String[] args) {
        try {
            List<String> content = Files.readAllLines(Paths.get("c:/temp/data/test.txt"));
            content.stream().forEach(line -> {
                try {
                     Files.write(
                             Paths.get("c:/temp/data/test2.txt"),
                             line.getBytes(),
                             StandardOpenOption.APPEND
                     );
                } catch (IOException ex) {
                     System.out.println(ex.getMessage());
                    System.out.println("Exception 1");
                }
            });
        } catch (IOException ex) {
            System.out.println("Exception 2");
        }
    }

}
