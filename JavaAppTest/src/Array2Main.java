

public class Array2Main {
  
    public static void main(String[] args) {
          int[ ]   x={1,2,3};
          int[ ]  y=new int[x.length*2];
          for(int i=0;i<x.length;i++)
          {
              y[i]=x[i];
          }
          x=y;
          
    }

}
