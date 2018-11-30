package BTest809;

import java.util.function.BiFunction;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;


public class Q53 {
  
    public static void main(String[] args) {
       IntStream stream=IntStream.of(1,2,3);
    //   IntFunction<Integer> inFu=x->y->x*y;
       IntFunction<IntUnaryOperator> inFu=x->y->x*y;
       IntStream newStream=stream.map(inFu.apply(10));
       newStream.forEach(System.out::print);
    }

}
