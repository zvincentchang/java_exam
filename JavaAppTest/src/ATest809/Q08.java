package ATest809;

interface P {
    public void method1();
}
interface Q extends P{
    public void method1();
}
interface T {
    public void method1();
    public void method2();
}
public class Q08 {
  
    public static void main(String[] args) {
        Q px=()->{System.out.println("Q Interface");};
        px.method1();
        
    }

}
