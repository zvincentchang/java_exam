package ATest809;

import java.util.*;
public class Q26 {
  
    public static void main(String[] args) {
       List<String> nums=Arrays.asList("EE","SE");
       String ans=nums.parallelStream().reduce("Java ", (a,b)->a.concat(b));
       System.out.println(ans);
    }

}
