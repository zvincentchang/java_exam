package ATest809;

interface It1{
    public default void sayHi(){
        System.out.println("It1 Hi");
    }
}
interface It2{
    public default void sayHi(){
        System.out.println("It2 Hi");
    }
}
public class Q11 implements It1,It2{
  
    public static void main(String[] args) {
       It1 obj=new Q11();
       obj.sayHi();
    }
   public  void sayHi(){
        System.out.println("Q11 Hi");
    }
}
