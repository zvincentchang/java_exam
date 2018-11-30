package z803;

public class Q002 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String[] table={"aa" , "bb" ,"cc"};
         for(String x : table)
         {
        	 int ii=0;
        	 while(ii<table.length){
        		 System.out.println(x+", "+ii);
        		 ii++;
        	 }
        		 
         }
         
         //Result : How many times is 2 printed as part of output ?
	}

}
