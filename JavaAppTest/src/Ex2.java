/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;

public class Ex2 {
  
    public static void main(String[] args) {
          int[]  x={1,2,3};
          //System.out.println(x[x.length]);
          System.out.println("End");
          File f=new File("c:\\temp\\a.txt");
          try{
              f.createNewFile();
          }catch(Exception ex){}
    }

}
