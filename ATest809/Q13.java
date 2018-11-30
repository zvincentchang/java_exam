package ATest809;

enum Courses{
    JAVA(100) ,J2SE(150) ;
     int cost;
    Courses(int v){
        cost=v;
    }
    int getCost(){
        return cost;
    }
}
public class Q13 {
  
    public static void main(String[] args) {
       for(Courses  a: Courses.values()){
           System.out.println(a.getCost());
       } 
    }

}
