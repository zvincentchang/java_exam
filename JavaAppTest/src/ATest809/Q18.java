
package ATest809;


public class Q18 {
    double discount(double d){
        assert( d>0);
        return d*0.5;        
    }
    public static void main(String[] args) {
       Q18 prod=new Q18();
       double dis=prod.discount(Double.parseDouble("0"));
       System.out.println(dis);
    }

}
