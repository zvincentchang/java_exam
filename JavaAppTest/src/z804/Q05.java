package z804;

public class Q05 extends Thread {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Q05();
		Thread t2=new Q05();
		t2.start();
		t1.start();

	}
	//Override run 一定要宣告public
    public void run()
    {
    	System.out.print(Thread.currentThread().getName()+"  " );
    	System.out.print(Thread.currentThread().getName()+"  ");
    }
}
