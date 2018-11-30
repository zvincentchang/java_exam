
package BTest809;

import java.util.*;
import java.util.function.Predicate;
public class Q46 {
  
    public static void main(String[] args) {
          List<String> str=Arrays.asList("my","pen","is","your","pen");
          Predicate<String> test=s->{
              int i=0;
              boolean result=s.contains("pen");
              System.out.println((i++)+":A");
              return result;
          };
          str.stream().filter(test).findFirst().ifPresent(System.out::print);
          System.out.println();
    }

}
