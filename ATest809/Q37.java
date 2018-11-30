package ATest809;
import java.util.*;
class Person2{
    private String FName;
    private int salary;
    public Person2(String f,int s){
        FName=f;
        salary=s;
    }

    /**
     * @return the FName
     */
    public String getFName() {
        return FName;
    }

    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }
}

public class Q37 {
  
    public static void main(String[] args) {
       List<Person2> pg=Arrays.asList(new Person2("Smith",1500),new Person2("John",2000)
       ,new Person2("Joe",1000)  );
       double dVal=pg.stream().filter(s->s.getFName().startsWith("J")).mapToInt(Person2::getSalary)
               .average().getAsDouble();
       
       System.out.println(dVal);
    }

}
