package BTest809;

import java.util.Arrays;

class CheckClass{
    public static  int checkValue(String s1,String s2){
        return s1.length()-s2.length();
    }
}

public class Q47 {
  
    public static void main(String[] args) {
       String[ ] strArray={"Tiger","Rat","Cat","Lion"};
       Arrays.sort(strArray,CheckClass::checkValue);
       for(String s: strArray)
           System.out.print(s+" ");
       
    }

}
