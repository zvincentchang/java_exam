/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ATest809;
abstract class Operator{
    protected abstract void turnON();
    protected abstract void turnOFF();
}
class EngineOP extends Operator{

    @Override
    public final void turnON() {
        System.out.println("ON");
    }

    @Override
    public final void turnOFF() {
        System.out.println("OFF");
    }
    
}
class Engine{
    Operator op=new EngineOP();
    public void operate(){
        op.turnON();
        op.turnOFF();
    }
}
public class Q36 {
  
    public static void main(String[] args) {
       Engine car=new Engine();
       car.operate();
    }

}
