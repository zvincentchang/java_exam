package ATest809;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Country{
    enum Continent {ASIA,EUROPE}
    String name;
    Continent region;
    Country(String n,Continent r){
        name=n;
        region=r;
    }
    public String getName(){ return name;}
    public Continent getRegion(){return region;}
}

public class Q39 {
  
    public static void main(String[] args) {
       List<Country> list=Arrays.asList( new Country("Italy",Country.Continent.EUROPE),
           new Country("Japan",Country.Continent.ASIA),new Country("German",Country.Continent.EUROPE)       
       );
       Map<Country.Continent , List<String>> regName=list.stream().collect(
               Collectors.groupingBy(Country::getRegion , Collectors.mapping(Country::getName, Collectors.toList())));
       System.out.println(regName);
    }

}
