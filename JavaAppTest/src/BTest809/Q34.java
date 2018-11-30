package BTest809;

import java.util.concurrent.*;

class Caller implements Callable<String>{
    String str;
    public Caller(String s){ str=s;}
    @Override
    public String call() throws Exception {
        return str.concat(" Caller" );
    }    
}
class Runner implements Runnable{
      String str;
    public Runner(String s){ str=s;}
    @Override
    public void run() {
       System.out.println(str.concat(" Runner "));
    }
    
}
public class Q34 {
  
    public static void main(String[] args) throws InterruptedException , ExecutionException{
       ExecutorService es=Executors.newFixedThreadPool(2);
       Future f1=es.submit(new Caller("Call "));
       Future f2=es.submit(new Runner("Run "));
       String s1=(String)f1.get();
       String s2=(String)f2.get();
       System.out.println("\n"+s1+":"+s2);
      // es.shutdown();
    }

}
