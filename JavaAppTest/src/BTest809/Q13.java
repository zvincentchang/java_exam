package BTest809;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Q13 {
  
    public static void main(String[] args) {
       List<Integer> data=Arrays.asList(10,20,8);
       System.out.println(data.stream().max(Comparator.comparing(a->a)).get());
    }

}
