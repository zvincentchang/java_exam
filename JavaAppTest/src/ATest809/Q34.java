package ATest809;

import java.util.stream.Stream;


public class Q34 {
  
    public static void main(String[] args) {
        Stream.of("Java","Unix","Linux").filter(s->s.contains("n"))
                .peek(s->System.out.println("Peek:"+s)).findFirst();
        Stream.of("Java","Unix","Linux").filter(s->s.contains("n"))
                .peek(s->System.out.println("Peek:"+s)).findAny();
    }

}
