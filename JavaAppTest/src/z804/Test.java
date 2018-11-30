package z804;
public class Test extends AbsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] table = { "aa", "bb", "cc" };
		
		for (String ss : table) {
			int ii = 0;
			while (ii < table.length) {
				System.out.println(ii);
				ii++;
				//break;
			}
		}
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
