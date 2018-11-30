package z803;

public class Q023 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		doSomething();
	}
    public static void doSomething() throws Exception
    {
    	System.out.println("before if Clause");
    	if(Math.random()>0.5)
    		throw new Exception();
    	System.out.println("After if Clause");
    }
    //What is Possible output
}
