package ATest809;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

class R implements Runnable {

    @Override
    public void run() {
        System.out.println("R ... run()");
    }

}

class C implements Callable<String> {

    @Override
    public String call() throws Exception {
        return "C call()";
    }

}

public class Q09 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService srv = Executors.newSingleThreadExecutor();
        srv.execute(new R());
        Future<String> ft = srv.submit(new C());

        System.out.println(ft.get());
        srv.shutdown();

    }

}
