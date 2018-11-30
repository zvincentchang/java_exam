package z803;

public class Q039 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student bob=new Student();
		Student jian=new Student();
		bob.name="Bob";
		bob.age=19;
		jian=bob;
		jian.name="Jian";
		bob.display();

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