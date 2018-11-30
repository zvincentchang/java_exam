package BTest809;

interface Movable<Integer>{
    default void walk(Integer distance){System.out.println("Walking");}
    void run(Integer i);
}

public class Q20 {
  
    public static void main(String[] args) {
       Movable<Integer> animal=n->System.out.println("running "+n);
      // Movable<Integer> animal=n->n+10;
       animal.run(100);
       animal.walk(20);
    }

}
