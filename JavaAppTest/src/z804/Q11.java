package z804;

public class Q11 {

	public static void main(String[] args) {
        String name="John-.-George-.-Paul-.-Ringo";
        String[] split=name.split("-.-");
        for(String s:split)
        	System.out.println(s);
	}
   //John
  //George
  //Paul
  //Ringo
}
