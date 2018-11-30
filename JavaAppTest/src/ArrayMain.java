public class ArrayMain {
  
    public static void main(String[] args) {
         int[ ]  x={10,5,3,1,2,8,6,7,9,4};
         for(int i=0;i<x.length-1;i++)
         {
             for(int j=i+1;j<x.length;j++)
             {
                 if(x[i]>x[j])
                 {
                     int temp=x[i];
                     x[i]=x[j];
                     x[j]=temp;
                 }
             }
         }
         System.out.println(x);
    }

}
