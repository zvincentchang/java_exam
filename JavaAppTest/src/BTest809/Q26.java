
package BTest809;

interface Rideable{
    Car getCar(String n);
}
class Car{
    private String name;
    public Car(String n){
        name=n;
    }
    public String toString(){
        return name;
    }
}

public class Q26 {
  
    public static void main(String[] args) {
       Rideable rider=Car::new;
       Car vehicle =rider.getCar("MyCar");
       System.out.println(vehicle);
    }

}
