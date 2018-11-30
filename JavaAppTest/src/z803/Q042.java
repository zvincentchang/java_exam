package z803;

public class Q042 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new Q042().x("3");
	}
    void x(Object obj)
    {
    	System.out.println("One");
    }
    void x(Number obj)
    {
    	System.out.println("Two");
    }
    void x(Integer obj)
    {
    	System.out.println("Three");
    }
}
