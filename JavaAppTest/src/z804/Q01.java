package z804;

public class Q01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// %3$b : 3$指定格式所在位置(第三個位置) %b 只要不是null都是true
         String f="%2$s , %s , %3$b\n";
         String[] var={"2","1",null};
         System.out.format(f,var);
         String[] var1={"2","1","0"};
         System.out.format(f,var1);
	}

}
