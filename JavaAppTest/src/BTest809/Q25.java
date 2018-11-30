package BTest809;

import java.util.Optional;

class Address{
    String city="New York";
    public String getCity(){ return city;}
    public String toString(){
        return city;
    }
}
class Emp3{
    Optional<Address> address;
    Emp3(Optional<Address> address){
        this.address=address;
    }
    public Optional<Address> getAddress(){return address;}
}

public class Q25 {
  
    public static void main(String[] args) {
       Address address=null;
       Optional<Address> addrs1=Optional.ofNullable(address);
       Emp3 e1=new Emp3(addrs1);
       
       String eaddress=(addrs1.isPresent()) ? addrs1.get().getCity(): "City not available";
       System.out.println(eaddress);
    }

}
