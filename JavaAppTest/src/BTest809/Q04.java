package BTest809;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Q04 {
  
    public static void main(String[] args) {
       List<String> colors=Arrays.asList("red","green","yellow");
       Predicate<String>  test=n-> { 
           System.out.println("Searching...");
           return n.contains("red");
       };
      // colors.stream().filter(c->c.length()>3).allMatch(test);
       boolean f=colors.stream().filter(c->c.length()>=3).anyMatch(test);
    //   System.out.println(f);
   //  List<String> data=colors.stream().filter(c->c.length()>3).filter(test).collect(Collectors.toList());
      //System.out.println(data);
    }

}
