package z803;

public class Q034 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student bob=new Student();
       Student jean=new Student();
       bob.name="Bob";
       bob.age=19;
       jean=bob;
       jean.name="Jean";
       System.out.println("Bob name is:"+bob.name);
	}

}
/*
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
*/