
public class WhileMain {
  
    public static void main(String[] args) {
          int sum=0;
          int i=1;
          while(i<=10){
              if(i<10)
                  System.out.print(i+"+");
              else
                   System.out.print(i+"=");
             
              sum+=i;
               i++;
          }
          System.out.println(sum);
    }

}
