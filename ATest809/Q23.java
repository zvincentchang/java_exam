package ATest809;

import java.util.stream.*;


public class Q23 {
  
    public static void main(String[] args) {
       //DoubleStream str=DoubleStream.of(1,2,3,4);
       IntStream str=IntStream.of(1,2,3,4);
       Double d=str.average().getAsDouble();
       System.out.println(d);
    }

}
