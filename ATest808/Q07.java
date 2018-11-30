package ATest808;


public class Q07 {
  
    public static void main(String[] args) {
       
    }
   
}
class Vehicle{
       int x;
       Vehicle(int v){
           x=v;
       }
        Vehicle(){
           this(20);
       }
   }

class Car extends Vehicle{
       int y;
       Car(int v){
           y=v;
       }
        Car(){
           super();
      //     this(10);
       }
   }