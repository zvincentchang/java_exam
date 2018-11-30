package ATest809;

import java.util.Arrays;
import java.util.List;


public class Q49 {
  
    public static void main(String[] args) {
       List<String> cs=Arrays.asList("Java","Java EE","Java ME");
       boolean b=cs.stream().allMatch(w->w.equals("Java"));
       //boolean b=cs.stream().findAny().get().equals("Java");
       //boolean b=cs.stream().anyMatch(w->w.equals("Java"));
       System.out.println(b);
    }

}
