package ATest809;
import java.util.*;
class Product{
    String name;
    int qty;
    public String toString(){
        return name;
    }
    public Product(String n ,int q){
        name=n;
        qty=q;
    }
    static class ProductFilter{
        public static boolean isAvailable(Product p){
            return p.qty>=10;
        }
    }
}

public class Q25 {
  
    public static void main(String[] args) {
       List<Product> pts=Arrays.asList(new Product("MotherBoard",5),new Product("Speaker",20));
       pts.stream().filter(Product.ProductFilter::isAvailable).forEach(p->System.out.println(p));
       
    }

}
