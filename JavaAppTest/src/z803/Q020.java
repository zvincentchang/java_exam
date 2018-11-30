package z803;

public class Q020 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1="Hello World";
        String s2=new String("Hello World");
        if(s1==s2)
        	System.out.println("They match");
        if(s1.equals(s2))
        	System.out.println("They Really match");
	}

}
