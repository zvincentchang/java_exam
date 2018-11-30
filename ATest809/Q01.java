package ATest809;

import java.util.*;
import java.util.stream.Stream;
public class Q01 {
  
    public static void main(String[] args) {
       List<Integer> data=Arrays.asList(10,20);
       List<Integer> data2=Arrays.asList(15,30);
       Stream.of(data,data2).flatMap(list->list.stream()).forEach(s->System.out.print(s+" "));
    }

}
