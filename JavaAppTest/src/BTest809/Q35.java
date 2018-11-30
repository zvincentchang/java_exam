package BTest809;

import java.util.function.*;
import java.util.stream.*;


public class Q35 {
  
    public static void main(String[] args) {
       IntStream stream =IntStream.of(1,2,3);
       IntFunction<IntUnaryOperator> inFu=x->y->x*y;
       IntStream newStream=stream.map(inFu.apply(10));
       newStream.forEach(System.out::println);
    }

}
