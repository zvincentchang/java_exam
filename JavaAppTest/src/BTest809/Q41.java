package BTest809;

import java.util.*;


public class Q41 {
  
    public static void main(String[] args) {
     List<String> listVal=Arrays.asList("Joe","Paul","Alice","Tom");
     long c=listVal.stream().filter(x->x.length()>3).count();
     System.out.println(c);
    }

}
