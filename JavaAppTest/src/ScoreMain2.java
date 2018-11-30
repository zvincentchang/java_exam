/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class ScoreMain2 {
  
    public static void main(String[] args) {
       int score=(int)(Math.random()*101);
       int level=score/10;
       switch(level){
           case 10:
           case 9:
               System.out.println(score+" A");
               break;
           case 8:
                System.out.println(score+" B");
               break;
           case 7:
                System.out.println(score+" C");
               break;
           case 6:
                System.out.println(score+" D");
               break;
           default:
                System.out.println(score+" F");
               break;
       }
       
    }

}
