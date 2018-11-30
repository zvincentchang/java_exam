package z803;

public class Q005 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Student st=new Student();
         st.name="Bob";
         st.age=20;
         //st.year=1982;
	}
  // a. year set to 1982
  // b. st.year set to 1982
 //  c. Runtime Error
 // d. Compile Time Error
}
class Student
{
	String name="";
	int age=0;
	String major="undeclared";
	public void display()
	{
		System.out.println("Name:"+name+",Major:"+major);
	}
}
