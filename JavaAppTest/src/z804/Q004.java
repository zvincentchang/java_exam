package z804;
public class Q004 {

	/**
	 * @param args
	 */
	int z;
	public static void main(String[] args) {
		// TODO Auto-generated method stub		 
		 Q004  myScope = new Q004(); 
		 int z = 6; 
		 System.out.print(z); 
		 myScope.doStuff(); 
		 System.out.print(z); 
		 System.out.print(myScope.z);
	 }
	void doStuff() { 
		int z = 5; 
		doStuff2(); 
		System.out.print(z); 
	}
	void doStuff2() { 
		z=4; 
	}
 }
//		What is the result?
//		A.6 5 6 4    B.6 5 5 4   C.6 5 6 6

	


