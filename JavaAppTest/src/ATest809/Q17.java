
package ATest809;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    private String name;
    private String course;
    private String city;
    public Student(String n,String c,String ci){
        name=n;
        course=c;
        city=ci;
    }
    public String toString(){
        return name+":"+city+":"+course;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the course
     */
    public String getCourse() {
        return course;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }
}
public class Q17 {
  
    public static void main(String[] args) {
       List<Student> data=Arrays.asList(new Student("Jessy","Java ME","Chi"),
               new Student("Hellen","Java EE","Hugh"),new Student("Mark","Java ME","Chi"));
       data.stream().collect(Collectors.groupingBy(Student::getCourse))
               .forEach((src,res)->System.out.println(src+":"+res));
    }

}
