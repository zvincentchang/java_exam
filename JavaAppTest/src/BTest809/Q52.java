package BTest809;
import java.io.*;

public class Q52 {
  
    public static void main(String[] args) throws IOException {
       BufferedReader  brCopy=null;
       try(BufferedReader br=new BufferedReader(new FileReader("c:/temp/data.txt"))){
           br.lines().forEach(c->System.out.println(c));
           brCopy=br;
       }
       brCopy.ready();
    }

}
