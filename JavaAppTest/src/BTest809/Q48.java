package BTest809;
import java.util.*;
import java.io.*;
public class Q48 {
  
    public static void main(String[] args) throws Exception{
       Properties prop=new Properties();
       FileInputStream fis=new FileInputStream("c:/temp/message.properties");
       prop.load(fis);
       System.out.println(prop.getProperty("welcome1"));
       System.out.println(prop.getProperty("welcome2","Test"));
       System.out.println(prop.getProperty("welcome3"));
    }

}
