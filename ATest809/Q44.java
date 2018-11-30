package ATest809;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;


public class Q44 {
  
    public static void main(String[] args) {
       Map<Integer,Integer> mVal=new HashMap<>();
       mVal.put(1,10);
       mVal.put(2,20);
        mVal.put(3,30);
       BiConsumer<Integer,Integer> c=(i,j)->{
           System.out.print(i+","+j+" ; ");
       };
       
       c.accept(1,2);
       mVal.forEach(c);
    }

}
