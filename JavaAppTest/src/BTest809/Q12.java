
package BTest809;
import java.io.*;

public class Q12 {
  
    public static void main(String[] args) {
         int i;
         char c;
         try(FileInputStream fis=new FileInputStream("c:/temp/data/test2.txt") ;
              InputStreamReader isr=new InputStreamReader(fis);           
          ){
             while(isr.ready()){
                 isr.skip(2);
                 char ch=(char)isr.read();
                 System.out.print(ch);
             }
         }catch(Exception ex){
             System.out.println(ex.getMessage());
         }
    }

}
