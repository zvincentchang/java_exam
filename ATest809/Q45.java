
package ATest809;

import java.util.*;
import java.util.function.Predicate;


public class Q45 {
  
    public static void main(String[] args) {
       List<String> words=Arrays.asList("win","try","best","luck","do");
       Predicate<String> test1=w->{
           System.out.println("Checking...");
           return w.equals("do");
       };
       Predicate<String>  test2=(String w)->w.length()>3;
       words.stream().filter(test2).filter(test1).count();
       
    }

}
