
package BTest809;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class Emp{
    private String eName;
    private Integer eAge;
    Emp(String n ,Integer i){
        eName=n;
        eAge=i;
    }
 
    public String getName() {
        return eName;
    }

    public Integer geteAge() {
        return eAge;
    }
}
public class Q01 {
    public static void main(String[ ] args){
        List<Emp> data=Arrays.asList(new Emp("Sam",30),new Emp("John",60),new Emp("Jim",51));
        Predicate<Emp> pd=s->s.geteAge()>50;
        data=data.stream().filter(pd).collect(Collectors.toList());
        Stream<String> st=data.stream().map(Emp::getName);
        st.forEach(s->System.out.println(s));
        
    }
}
