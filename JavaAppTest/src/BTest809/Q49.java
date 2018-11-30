package BTest809;
import java.util.*;

public class Q49 {
  
    public static void main(String[] args) {
       Map<Integer,String> map=new HashMap<>();
       map.put(10, "z");
       map.put(5, "b");
       map.put(1, "d");
       map.put(7, "e");
       map.put(50, "j");
       Map<Integer,String> treeMap=new TreeMap<>(new Comparator<Integer>(){
           @Override
           public int compare(Integer o1, Integer o2) {
               return o2.compareTo(o1);
           }           
       });           
       treeMap.putAll(map);
       for(Map.Entry<Integer,String> entry: treeMap.entrySet()){
           System.out.print(entry.getValue()+"  ");
       }
    }

}
