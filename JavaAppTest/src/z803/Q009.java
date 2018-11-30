package z803;

public class Q009 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           try{
        	   doStuff();
        	   System.out.println("1");
           }catch(Exception e)
           {
        	   System.out.println("2");
           }
	}
	public static void doStuff()
	{
		if(Math.random()>0.5)  throw new RuntimeException();
		doMoreStuff();
		System.out.println("3");
	}
    public static void doMoreStuff()
    {
    	System.out.println("4");
    }
    // Which 2 are possible?
    // a. 2
    // b. 4 3 1
    // c. 1  2
    // d. 1 3 4
}
