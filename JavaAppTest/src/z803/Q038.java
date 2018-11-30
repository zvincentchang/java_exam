package z803;

public class Q038 {

	int z;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Q038 obj=new Q038();
      int z=6;
      System.out.println(z);
      obj.doStuff();
      System.out.println(z);
      System.out.println(obj.z);
	}
    public void doStuff()
    {
    	int z=5;
    	doStuff2();
    	System.out.println(z);
    }
    public void doStuff2()
    {
    	z=4;
    }
}
