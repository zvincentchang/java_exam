package BTest809;
class MyThread2 implements Runnable{
    String src[]={"A","B","C"};
    int count=0;
    public synchronized void run(){
        while(count<src.length){
            System.out.print(src[count]);
            count++;
        }
           System.out.println();
    }
}

public class Q59 {
  
    public static void main(String[] args) {
       MyThread2 m=new MyThread2();
       Thread t1=new Thread(m);
        Thread t2=new Thread(m);
     
            t1.start();
            t2.start();
       
        
     
       
    }

}
