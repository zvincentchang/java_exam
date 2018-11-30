
package ATest809;
import java.util.*;

public class Q07 {
  
    public static void main(String[] args) {
       Deque<String> data=new ArrayDeque<>();
       data.add("Susan");
       data.add("Alan");
       data.add("David");
       System.out.println(data.pop());
       System.out.println(data.remove());
       System.out.println(data);
    }

}
