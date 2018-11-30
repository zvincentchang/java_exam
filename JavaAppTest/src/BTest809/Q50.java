package BTest809;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
class FileThread implements Runnable{
    String fName;
    public FileThread(String n){fName=n;}
    @Override
    public void run() {
        System.out.println(fName);
    }    
}

public class Q50 {
  
    public static void main(String[] args) throws IOException , InterruptedException {
        ExecutorService executor=Executors.newCachedThreadPool();
        Stream<Path> listOfFiles=Files.walk(Paths.get("c:/temp"));
        listOfFiles.forEach(line->{
            executor.execute(new FileThread(line.getFileName().toString()));            
        });
        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.DAYS);
        
    }

}
