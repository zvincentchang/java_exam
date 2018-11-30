package BTest809;

import java.util.function.*;


public class Q40 {
  
    public static void main(String[] args) {
     //  BiFunction<Integer,Double,Integer> val=(t1,t2)->t1+t2;  //第三個參數是回傳資料型別
       BiFunction<Integer,Double,Double> val=(t1,t2)->t1+t2;  //第三個參數是回傳資料型別
       System.out.println(val.apply(10,10.5));
    }

}
