package BTest809;

import java.util.function.ToIntFunction;


public class Q09 {
  
    public static void main(String[] args) {
       String str="Java is a progrmming language";
       ToIntFunction<String> indexVal=str::indexOf;
       int x= indexVal.applyAsInt("Java");
       System.out.println(x);
    }

}
