package z804;

public class Q03  {
    private int strict=2;
    public void show()
    {
    	//不可以宣告 protected
    	//protected  int strict=3;
    	System.out.println(strict);
    }
	public static void main(String[] args) {
		
         new Q03().show();
	}

}
