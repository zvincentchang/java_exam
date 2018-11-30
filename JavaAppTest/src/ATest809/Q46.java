
package ATest809;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Prod{
    String name;
    private Integer price;
    Prod(String n ,Integer p){
        name=n;
        price=p;
    }
    public void printVal(){
        System.out.println(name+":"+getPrice());
    }

    /**
     * @return the price
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Integer price) {
        this.price = price;
    }
    
}

public class Q46 {
  
    public static void main(String[] args) {
       List<Prod> li=Arrays.asList(new Prod("TV",1000),new Prod("Refrtigator",2000));
       Consumer<Prod> raise=e->e.setPrice(e.getPrice()+100);
       li.forEach(raise);
       li.stream().forEach(Prod::printVal);
    }

}
