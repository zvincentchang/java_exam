package z803;

public class Q050 {

	static String s="";
	static void doIt(Object obj){ s+="O ";}
	static void doIt(Integer obj){s+="I ";}
	static void doIt(long obj){s+="L ";}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x=1;
        Integer[] ia={1,2};
        doIt(x);
        doIt(ia);
        System.out.println(s);
	}

}
