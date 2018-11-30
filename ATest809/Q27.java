/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ATest809;
class PT{
    interface Movable {void move();}
    Movable m=new Movable(){
        @Override
        public void move() {
           
        }        
    };
}
class Block{
   static int bno;
    static class Counter{
        int loc;
        Counter(){
            loc=bno;
        }
    }
}
class Computer{
    private Card c=new SoundCard();
    private abstract class Card{
    }
    private class SoundCard extends Card{}
    
    
}
public class Q27 {
  
    public static void main(String[] args) {
       
    }

}
