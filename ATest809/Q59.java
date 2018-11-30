package ATest809;

import java.util.concurrent.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;


public class Q59 {
  
    public static void main(String[] args) {
       final List<String> list=new CopyOnWriteArrayList();
       final AtomicInteger ai=new  AtomicInteger(0);
       
       final CyclicBarrier bar=new CyclicBarrier(2, new Runnable(){
           @Override
           public void run() {
               System.out.println(list);
           }
           
       });
       Runnable r=new Runnable(){
           @Override
           public void run() {
                 try{
                   Thread.sleep(1000*ai.incrementAndGet());
                   list.add("X");
                   bar.await();
              }catch(Exception ex){
                  
              }
           }
           
       };
       new Thread(r).start();
        new Thread(r).start();
         new Thread(r).start();
          new Thread(r).start();
          
       
    }

}
