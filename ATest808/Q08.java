/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ATest808;


public class Q08 {
  
    public static void main(String[] args) {
        int x=1;
        if(isOK(x))
            System.out.println(x);
    }
   static boolean isOK(int x){
       return x-- >0 ?true : false;
   }
}
