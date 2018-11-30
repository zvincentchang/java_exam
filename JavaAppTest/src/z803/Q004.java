package z803;

public class Q004 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
   
}
interface SampleClosable
{
	public void close() throws java.io.IOException;
	
}
// 3 valid declaration
// class Test implements  SampleClosable {
//     public void close() throws java.io.IOException{}
// }

//class Test implements  SampleClosable {
//    public void close() throws Exception{}
//}

//class Test implements  SampleClosable {
//   public void close() throws java.io.FileNotFoundException{}
//}

//class Test extends  SampleClosable {
//   public void close() throws java.io.IOException{}
//}

//class Test implements  SampleClosable {
//    public void close() {}
//}
