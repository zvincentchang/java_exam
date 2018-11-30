
package BTest809;

import java.util.function.Consumer;
import java.util.function.Supplier;

class Bird{
    public void fly(){
        System.out.println("can fly");
    }
}
class Peguin extends Bird{
    public void fly(){
        System.out.println("can not fly");
    }
}
 class Birdie {
  
    public static void main(String[] args) {
         //fly(()->new Bird());
         fly(Bird::new);
         fly(Peguin::new);
    }
   static void fly(Supplier<Bird>  bird){
       bird.get().fly();
   }
 
}
