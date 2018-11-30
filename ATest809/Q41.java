package ATest809;

import java.util.*;
import java.util.stream.Stream;


public class Q41 {
  
    public static void main(String[] args) {
       Stream<List<String>> strs=Stream.of(Arrays.asList("text1","text2"),
               Arrays.asList("text2","text3"));
       Stream<String> bs2=strs.filter(b->b.contains("text1")).flatMap(rs->rs.stream());
       bs2.forEach(b->System.out.println(b));
    }

}
