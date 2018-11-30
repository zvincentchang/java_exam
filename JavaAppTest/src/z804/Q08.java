package z804;

public class Q08 {
	static String data="";
    public  static void doIt(long x)
    {
        data+="L ";	
    }
    public  static void doIt(Integer x)
    {
        data+="I ";	
    }
    public  static void doIt(Object x)
    {
        data+="O ";	
    }
	public static void main(String[] args) {
	     int x=1;
	     Integer[] obj={ 1,3};
	     doIt(x);
	     doIt(obj);
	     System.out.println(data);
        
	}

}
