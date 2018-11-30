
package ATest809;

import java.util.*;
import java.util.function.UnaryOperator;
public class Q21 {
  
    public static void main(String[] args) {
       List<Integer> data=Arrays.asList(10,20);
       //UnaryOperator<Double> op=s->s+10.0;
       UnaryOperator<Integer> op=s->s+10;
       data.replaceAll(op);
       data.forEach(c->System.out.println(c));
    }

}
