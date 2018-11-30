
package BTest809;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
public class Q17 {
  
    public static void main(String[] args) {
       List<String> data=Arrays.asList("Jim","John","Jeff");
       Function<String,String> func= s-> " Hello ".concat(s);
       //data.stream().map(func).peek(System.out::print).collect(Collectors.toList());
       data.stream().map(func).peek(System.out::print);
    }

}
