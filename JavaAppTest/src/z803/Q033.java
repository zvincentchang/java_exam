package z803;

public class Q033 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      char[] arr={'A','e','I','O','u'};
      int count =0;
      for(int i=0;i<arr.length;i++)
      {
    	  switch(arr[i])
    	  {
    	  case 'A':
    		  continue;
    	  case 'a':
    		  count++;
    		  break;
    	  case 'E':
    		  count++;
    		  break;
    	  case 'I':
    		  count++;
    		  continue;
    	  case 'O':
    		  count++;
    		  break;
    	  case 'U':
    		  count++;
    		  
    	  }
      }
       System.out.println("Total:"+count);
	}

}
