package BTest809;
import java.util.*;

public class Q10 {
  
    public static void main(String[] args) {
        List<Integer> values=Arrays.asList(1,2,3);
        values.stream().map(n->n*2).peek(System.out::print).count();
        
   
    }

}
