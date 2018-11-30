
package BTest809;

import ATest809.*;
import java.util.*;
import java.util.function.UnaryOperator;
public class Q16 {
  
    public static void main(String[] args) {
       List<Double> data=Arrays.asList(1000.0,2000.0);
       UnaryOperator<Double> op=s->s*2;
       //UnaryOperator<Integer> op=s->s*2;
       data.stream().filter(v->v>=1500).map(lv->op.apply(lv))
               .forEach(s->System.out.print(s+" "));
    }

}
