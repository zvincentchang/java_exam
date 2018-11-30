
package ATest809;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Vehicle{
  private int vId;
private String vName;
public Vehicle(int i ,String n){
    vId=i;
    vName=n;
}

    /**
     * @return the vId
     */
    public int getVId() {
        return vId;
    }

    /**
     * @return the vName
     */
    public String getvName() {
        return vName;
    }
    public String toString(){
        return vId+":"+vName;
    }
}

public class Q57 {
  
    public static void main(String[] args) {
       List<Vehicle> vh=Arrays.asList(new Vehicle(2,"Car"),new Vehicle(3,"Bike"),new Vehicle(1,"Truck"));
      // vh.stream().sorted((v1,v2)->Integer.compare(v1.getVId(), v2.getVId())).forEach(System.out::println);
      //vh.stream().map(v->v.getVId()).sorted().forEach(System.out::println);
       vh.stream().sorted( Comparator.comparing((Vehicle v)->v.getVId()) ).forEach(System.out::println);
    }

}
