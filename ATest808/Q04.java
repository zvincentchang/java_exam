
package ATest808;


public class Q04 {
  
    public static void main(String[] args) {
      String names[]={"Thomas","Peter","Joseph"};
      String pwd[]=new String[3];
      int idx=0;
      try{
          for(String n :names){
              pwd[idx]=n.substring(2,6);
              idx++;
          }
      }catch(Exception ex){
          System.out.println("Invalid Names");
      }
      for(String x : pwd)
          System.out.println(x);
    }

}
