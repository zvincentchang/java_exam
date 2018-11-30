package z804;

class Bolt implements Runnable{

	@Override
	public void run() {
		try{
			Thread.sleep(1000);
		}catch(Exception ex){System.out.print(" exec ");}
		System.out.print(Thread.currentThread().getId()+" ");
		
	}
	
}
public class Q10 {

	public static void main(String[] args) {
		Bolt bt=new Bolt();
		Thread t1=new Thread(bt);
		Thread t2=new Thread(bt);
		try{
			t1.start();
			t2.start();
			t1.start();
		}catch(Exception ex){System.out.print("exec 2 ");}

	}

}
