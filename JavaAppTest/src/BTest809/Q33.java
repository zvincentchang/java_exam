

package BTest809;

import java.util.*;

class Product{
    int id,price;
    public Product(int i,int p){
        id=i;
        price=p;
    }
    public String toString(){
        return id+":"+price;
    }
}

public class Q33 {
  
    public static void main(String[] args) {
       List<Product> pts=new ArrayList<>(Arrays.asList(
               new Product(1,10),new Product(2,30),new Product(3,20)));
       Product p=pts.stream().reduce(new Product(4,0), (p1,p2)->{
           p1.price+=p2.price;
           return new Product(p1.id,p1.price);
       });
       System.out.println(p);
       pts.add(p);
       pts.stream().parallel().reduce((p1,p2)->p1.price>p2.price?p1:p2).ifPresent(System.out::println);
    }

}


