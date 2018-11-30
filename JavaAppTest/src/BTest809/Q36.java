package BTest809;
class Vehicle{
    int distance;
    Vehicle(int s){
        distance=s;
    }
    public void increSpeed(int time){
        int timeTravel=time;
        class Car{
            int value=0;
            public void speed(){
                value=distance/timeTravel;
                System.out.println("Value:"+value+" kmph");
            }
        }
        new Car().speed();
    }
}
public class Q36 {
  
    public static void main(String[] args) {
       Vehicle v=new Vehicle(100);
       v.increSpeed(60);
    }

}
