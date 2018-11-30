
public class MainMethod {
  
    public static void main(String[] args) {
        MainMethod mm=new MainMethod();
         int v1=mm.sum(10);
         int v2=mm.sum(50);
         System.out.println(v1);
          System.out.println(v2);
    }
     int sum(int x){
        int total=0;
        for(int i=1;i<=x;i++)
            total +=i;
        
        return total;
    }
     void calculate(int x){
        int total=1;
        for(int i=1;i<=x;i++)
            total=total*i;
        System.out.println(total);
    }
   
}
