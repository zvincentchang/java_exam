package BTest809;
import java.util.*;
import java.util.stream.Collectors;
class Student{
    private String course;
    private String name;
    private String city;

    public Student(String n,String c,String t){
        course=c;
        name=n;
        city=t;
    }
    public String toString(){
        return course+":"+name+":"+city;
    }
    public String getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }
    public String getCity() {
        return city;
    }
    
}
public class Q44 {
  
    public static void main(String[] args) {
        List<Student> stds=Arrays.asList(new Student("Jessy","Java ME","Chicago"),
                            new Student("Hellen","Java EE","Houston"),new Student("Mark","Java ME","Chicago"));
        stds.stream().collect(Collectors.groupingBy(Student::getCourse)).forEach((src,res)->System.out.println(src));
    }

}
