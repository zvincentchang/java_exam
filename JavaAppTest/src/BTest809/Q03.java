
package BTest809;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class ThreadRunner implements Runnable{

    @Override
    public void run() {
        System.out.println("Runnable");
    }    
}
class ThreadCaller implements Callable{

    @Override
    public String call() throws Exception {
        System.out.println("Callable");
        return "Callable";
    }
    
}
public class Q03 {
    public static void main(String[ ] args){
        ExecutorService  es=Executors.newCachedThreadPool();
        Runnable r1=new ThreadRunner();
        Callable  c1=new  ThreadCaller();
        
       //Future<String> f1=(Future<String>)es.submit(r1);
        es.execute(r1);
        es.submit(r1);
        Future<String> f2=es.submit(c1);
        es.shutdown();
    }
}
