package ATest809;

import java.util.*;
public class Q06 {
  
    public static void main(String[] args) {
       List<String> data=Arrays.asList("","A","","B","C");
       Long count=data.stream().filter(x->!x.isEmpty()).count();
       System.out.println(count);
    }

}
