package z804;
import java.io.IOException;
public class Q006 {
	  public static void main(String[] args) throws IOException{ 
		  try { 
			  System.out.println("Result: " + 2 + 3 + 5); 
			  System.out.println("Result: " + 2 + 1 * 5);
			  String theString = "Hello World"; 
			//  System.out.println(theString.charAt(11));
			//  doSomething(); 
		  } catch (RuntimeException e) { 
			  System.out.println(e); 
			  } 
		  } 
	  static void doSomething() throws IOException{ 
		  if (Math.random() > 0.5) 
			  throw new IOException(); 
		  throw new RuntimeException(); 
	 }
	
}
