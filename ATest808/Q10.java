package ATest808;


public class Q10 {
  
    public static void main(String[] args) {
         int[ ] data={2010,2013,2014,2015,2014};
         int key=2014;
         int count =0;
         for(int v:data){
             if(v!=key)
                 continue;
                 count++;
             
         }
         System.out.println(count);
    }

}
