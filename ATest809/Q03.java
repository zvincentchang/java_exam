package ATest809;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Person{
    private String name;
    private int age;
    public Person(String n ,int a){
        name=n;
        age=a;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }
}
public class Q03 {
    public static void main(String[] args){
        List<Person> data=Arrays.asList(new Person("Jack",30),new Person("Mike Hill",21),new Person("Thomas",24));
        Stream<Person> st=data.stream().filter(s->s.getAge()>=20);
        long count=st.filter(s->s.getName().contains("Hill")).count();
        System.out.println(count);
        
    }
}
