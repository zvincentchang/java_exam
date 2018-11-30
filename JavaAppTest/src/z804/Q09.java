package z804;

public class Q09 implements Runnable {
     @Override
     public void run()
     {
    	 for(int i=1;i<=5;i++)
    	 {
    		 try{
    			 Thread.sleep(1000);
    		 }
    		 catch(Exception ex){
    			 System.out.println(" e1 ");
    		 }
    		 System.out.print(i+" ");
    	 }
     }
	
	public static void main(String[] args) {
		Thread t1=new Thread(new Q09());
		try{
			t1.setDaemon(true);
		}catch(Exception ex){System.out.print(" e2 ");}
		
        t1.start();
        System.out.print(" a ");
        try{
        	Thread.sleep(2500);
        }catch(Exception ex){System.out.print(" e3 ");}
        System.out.print(" b ");
	}

}
