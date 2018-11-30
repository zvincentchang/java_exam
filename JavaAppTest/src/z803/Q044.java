package z803;

public class Q044 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println( display());
	}
   public static int display()
   {
	   int[]  array={100,2};
       try{
      	     int z=array[1]/array[2];
       }catch(java.lang.ArrayIndexOutOfBoundsException ex)
       {
      	 return 1;
       }catch(Exception ex2)
       {
    	   return 2;
       }
       finally{
    	   return 3;
       }
   }
}
