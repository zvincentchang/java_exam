/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class ForMain {
  
    public static void main(String[] args) {
         int x=100;
         for(int i=1;i<=x;i++)
         {
             if(i%3!=0)
             {
                 continue;
             }
             System.out.print(i+"  ");
         }
    }

}
