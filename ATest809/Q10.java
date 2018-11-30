package ATest809;

import java.util.*;
public class Q10 {
  
    public static void main(String[] args) {
       ArrayDeque<Integer> data=new ArrayDeque<>();
       data.add(1000);
       data.push(2000);
       data.add(3000);
       data.push(4000);
      Integer i1= data.remove();
      Integer i2= data.pop();
       System.out.println(i1);
       System.out.println(i2);
    }

}
