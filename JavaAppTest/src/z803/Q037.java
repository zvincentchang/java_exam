package z803;

public class Q037 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int x=0;
         while(x<3)
         {
        	 x++;
        	 System.out.print("|"+x+"|");
        	 switch(x)
        	 {
        	 case 1:
        		 System.out.print("case a ");
        	 case 2:
        		 System.out.print("case b ");
        		 break;
        	 }
         }
	}

}
