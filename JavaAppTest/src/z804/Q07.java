package z804;

public class Q07 extends Thread {
	
	public void run()
	{
		System.out.print("1 ");
		try{
			Thread.sleep(2000);
		}catch(Exception ex){
			System.out.print(" e1 ");
		}
		System.out.print(" 2 ");
	}

	public static void main(String[] args) {
		Thread t1=new Q07();
		t1.start();
		try{
			Thread.sleep(1000);
		}catch(Exception ex){
			System.out.print(" e2 ");
		}
		try{
			t1.interrupt();
		}catch(Exception ex){
			System.out.print(" e3 ");
		}
	}

}
