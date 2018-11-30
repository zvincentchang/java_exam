
package ATest808;


public class Q03 {
  
    public static void main(String[] args) {
       String s1="Java";
       String[] s2={"J","a","v","a"};
       String s3="";
       for(String s : s2)
           s3+=s;
       System.out.println(s3.equals(s1));
    }

}
