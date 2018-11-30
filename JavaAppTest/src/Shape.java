/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vincent
 */
public interface Shape {
    int isLargerThan(Shape s);
}
class Circle implements Shape{

    @Override
    public int isLargerThan(Shape s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    public static void main(String[]   args){
          Shape   sp=new Circle();
          int x=166;
          String s=Integer.toOctalString(x);
          System.out.println(s);
          int y=0xBA358+0xAE8BC;
          String s2=Integer.toHexString(y);
          System.out.println(s2);
    }

    
}