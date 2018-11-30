/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vincent
 */
public class FooImpl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FooImpl obj=new FooImpl();
        String[][]  arry={args};
        obj.main(arry);
    }
       public static void main(String[][] args) {
        // TODO code application logic here
        System.out.println(args[0][1]);
    }
}
