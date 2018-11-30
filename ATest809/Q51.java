
package ATest809;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;


public class Q51 {
  
    public static void main(String[] args) {
       List<String> wds=Arrays.asList("why ","what ","when ");
       BinaryOperator<String> op=(s1,s2)->s1.concat(s2);
       String sen=wds.stream().reduce("words:", op);
       System.out.println(sen);
    }

}
