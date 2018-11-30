
package ATest809;
import java.util.*;
import java.util.stream.Collectors;
class Test{
    List<String> list=null;
    public   void printValue(){
        System.out.print(getList());
    }
    public   List<String> getList(){
        return list;
    }
    public void setList(List<String> nList){
        list=nList;
    }
}

public class Q29 {
  
    public static void main(String[] args) {
       List<String> li=Arrays.asList("Dog","Cat","Mouse");
       Test t=new Test();
       t.setList(li.stream().collect(Collectors.toList()));
       t.getList().forEach(s->System.out.print(s));
       //t.getList().forEach(Test::printValue);
    }

}
