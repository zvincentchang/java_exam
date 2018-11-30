package BTest809;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.logging.Level;
import java.util.logging.Logger;

class Master implements Runnable{
        @Override
        public void run() {
           System.out.println("Master...");
        }        
    }
   class Worker extends Thread{
       CyclicBarrier cb;
       public Worker(CyclicBarrier cb){this.cb=cb;}
       public void run(){
           try {
               cb.await();
                System.out.println("Worker...");
           } catch (Exception ex) {
               Logger.getLogger(Q31.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
   }
public class Q31 {
    
    public static void main(String[] args) {
       Master m=new Master();       
       CyclicBarrier cb=new CyclicBarrier(1,m);
       Worker w=new Worker(cb);
       w.start();
    }

}
