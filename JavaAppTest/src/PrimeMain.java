/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class PrimeMain {
  
    public static void main(String[] args) {
         int x=53;
         boolean flag=true;
         for(int i=2;i<=x/2;i++){
             if(x%i==0){
                 flag=false;
                 break;
             }
             
         }
         if(flag)
             System.out.println("Prime");
         else
             System.out.println("not Prime");
   
    }

}
