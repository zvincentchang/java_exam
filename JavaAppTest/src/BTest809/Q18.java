
package BTest809;
import java.util.*;
import java.util.stream.Collectors;
class Emp2{
    private String fname;
    private String lname;
    public Emp2(String f,String l){
        fname=f;
        lname=l;
    }
    public String getFname() {
        return fname;
    }
    public String getLname() {
        return lname;
    }
    public String toString(){
        return fname+":"+lname;
    }
}

public class Q18 {
  
    public static void main(String[] args) {
       List<Emp2> data=Arrays.asList(new Emp2("John","Smith"),new Emp2("Peter","Sam"),new Emp2("Thomas","Wale"));
       data.stream().sorted(Comparator.comparing(Emp2::getFname)
               .reversed().thenComparing(Emp2::getLname)).collect(Collectors.toList()).forEach(System.out::println);
    }

}
