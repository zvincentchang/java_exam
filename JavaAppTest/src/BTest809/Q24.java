package BTest809;

import java.util.concurrent.atomic.AtomicInteger;

class MyThread implements Runnable{
    private static AtomicInteger count=new AtomicInteger(0);
    @Override
    public void run() {
       int x=count.incrementAndGet();
       System.out.println(x);
    }
    
}

public class Q24 {
  
    public static void main(String[] args) {
       Thread t1=new Thread(new MyThread());
       Thread t2=new Thread(new MyThread());
       Thread t3=new Thread(new MyThread());
       Thread[] ta={t1,t2,t3};
       for(int i=0;i<ta.length;i++)
           ta[i].start();
    }

}
