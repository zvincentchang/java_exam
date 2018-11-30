package z803;

public class Q030 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int i=1;
          do{
        	  if(i%2==0)
        		  continue;
        	  if(i==5)
        		  break;
        	  System.out.println(i+"\t");
        	  i++;
          }while(true);
	}
   // What is the Result ?
}
