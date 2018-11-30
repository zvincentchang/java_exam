package ATest809;
import java.io.*;

public class Q24 {
  
    public static void main(String[] args) {
       try(FileInputStream fis=new FileInputStream("c:/temp/data.txt");
             InputStreamReader isr=new InputStreamReader(fis);
              BufferedReader br=new BufferedReader(isr) ){
             if(br.markSupported()){
                 System.out.print((char)br.read());      
                      br.mark(2);
                    System.out.print((char)br.read());
                  br.reset();
                   System.out.print((char)br.read());
             }
       }catch(Exception ex){
           
       }
    }

}
