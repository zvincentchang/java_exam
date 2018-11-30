
import java.util.*;
import java.util.function.Consumer;
public class LambdaDemo1 {
  
    public static void main(String[] args) {
       List<String> data=Arrays.asList("A","B","C","D","E");
       data.forEach(n->System.out.print(n));
       System.out.println();
       data.forEach(new Consumer(){
           @Override
           public void accept(Object t) {
               System.out.print(t);
           }           
       });
         System.out.println();
         System.out.println(" ".isEmpty());
    }
   
}
