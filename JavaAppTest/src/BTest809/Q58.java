package BTest809;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class Q58 {
  
    public static void main(String[] args) {
       List<String> data=Arrays.asList("my| message| one","","my| message| two");
       data.stream().flatMap(line->Stream.of(line.split("\\|"))).forEach(s->System.out.print(s));
       
    }

}
