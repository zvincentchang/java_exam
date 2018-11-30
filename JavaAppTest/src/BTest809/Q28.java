package BTest809;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class TechName{
    String techName;
    TechName(String n){
        this.techName=n;
    }
}

public class Q28 {
  
    public static void main(String[] args) {
       List<TechName> tech=Arrays.asList(new TechName("Java-"),
               new TechName("Oracle DB-"),new TechName("J2EE-"));
       Stream<TechName> stre=tech.stream();
       stre.map(a->a.techName).forEach(System.out::print);
    }

}
