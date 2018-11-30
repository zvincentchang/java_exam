package z804;
import java.io.*;
public class Q04 {

	public static void main(String[] args) {
		
		displayDetails();
	}
    public static void displayDetails() 
    {
    	try(BufferedReader br=new BufferedReader(new FileReader("c:\\test.txt"))){
    		String rec=null;
    		while((rec=br.readLine()) !=null)
    		{
    			System.out.println(rec);
    		}
    		br.close();
    		//Try Resource 內的 br變數不可以再去開啟另外一個新資源
    		//br=new BufferedReader(new FileReader("c:\\test2.txt"));
    		//while((rec=br.readLine()) !=null)
     		//{
     		//	System.out.println(rec);
     		//}
    		// br.close();
    	}catch(IOException ex){
    		System.err.println(ex.getClass());
    	}
    }
}
