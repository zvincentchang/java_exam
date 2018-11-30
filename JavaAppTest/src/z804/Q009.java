package z804;
import java.util.ArrayList;

interface  Test1{
	void test();
}
abstract class AbsTest1 implements Test1{
	
}
public class Q009 {
    public static void main(String[] args)
    {
    	ArrayList<Integer> list=new ArrayList<>(1);
    	list.add(1001);
    	list.add(1002);
    	System.out.println(list.get(list.size()));
    }
}
