package ATest809;

import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;


public class Q31 {
  
    public static void main(String[] args) {
       IntConsumer consumer=e->System.out.println(e);
       Integer value=90;
       ToIntFunction<Integer> fun=e->e+10;       
       int rs=fun.applyAsInt(value);
      
       IntFunction<Integer> fun2=e->e+10;       
       Integer rs2=fun2.apply(value);
       consumer.accept(rs);
       consumer.accept(rs2);
       
    }

}
