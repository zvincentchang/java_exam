package ATest809;

import java.util.*;
public class Q15 {
  
    public static void main(String[] args) {
       List<Integer> data=Arrays.asList(3,4,5);
       data.stream().filter(e->e>4).peek(e->System.out.println("Price"+e))
               .map(n->n-1).forEach(e->System.out.println("New Price"+e));
    }

}
