/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class A2DMain {
  
    public static void main(String[] args) {
         int[ ][ ]   x=new int[2][3];
         int[][]  y={{1,2,3},{4,5,6}};
         for(int i=0;i<y.length;i++)
         {
             for(int j=0;j<y[i].length;j++)
             {
                 System.out.printf("[%d] [%d]=%d  ",i,j,y[i][j] );
             }
             System.out.println();
         }
         int[ ][ ][ ]  z={ 
             {
                 {1,2},{4,5}
             },
             {
                 {6,7},{8,9}      
             }
           
         };
         System.out.println();
         
         
    }

}
