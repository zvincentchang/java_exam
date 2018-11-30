package BTest809;

import java.util.Arrays;
import java.util.List;


public class Q14 {
  
    public static void main(String[] args) {
       List<String> data=Arrays.asList("100 HR","200 MG","101 HR2");
       data.stream().filter(s->s.contains("1")).sorted().forEach(System.out::println);
    }

}
