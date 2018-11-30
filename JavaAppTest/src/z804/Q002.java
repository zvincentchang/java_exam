package z804;
public class Q002 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student bob = new Student (); 
		 Student jian = new Student(); 
		 bob.name = "Bob"; 
		 bob.age = 19; 
		 jian = bob; 
		 jian.name = "Jian"; 
		 System.out.println("Bob's Name: " + bob.name);
	}

}

//View the exhibit: 
 class Student { 
	 public String name = ""; 
	 public int age = 0; 
	 public String major = "Undeclared"; 
	 public boolean fulltime = true; 
	 public void display() { 
		 System.out.println("Name: " + name + " Major: " + major); 
    } 
	 public boolean isFullTime() { 
		 return fulltime; 
     }
} 
  //What is the result when this program is executed?
 //  A. Bob's Name: Bob    B.  Bob's Name: Jian    C.   Nothing prints     D.  Bob's name
