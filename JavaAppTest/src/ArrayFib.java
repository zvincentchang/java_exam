/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class ArrayFib {
  
    public static void main(String[] args) {
         int[  ]  fn=new int[10];
         fn[0]=1;
         fn[1]=1;
         for(int i=2;i<fn.length;i++)
             fn[i]=fn[i-1]+fn[i-2];
         
    }

}
