package z803;

public class Q006 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student st=new Student();
         st.name="Bob";
         st.age=20;
         st.display();
	}
    // Result : Which line append to the  main() method to make st available for garbage collection
	// a. st.garbageCollect(); 
    // b. st.collect();
   //  c. st=undefined;
   // d. st=null;
}
