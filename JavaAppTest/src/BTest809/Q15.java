package BTest809;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Q15 {
  
    public static void main(String[] args) {
       Stream<List<String>>  st=Stream.of(Arrays.asList("1","John"),Arrays.asList("2","null"));
       Stream<String>   st2= st.flatMap(x->x.stream());
       st2.forEach(System.out::println);
    }

}
