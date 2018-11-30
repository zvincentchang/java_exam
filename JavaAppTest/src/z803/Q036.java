package z803;

public class Q036 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SampleB sb=new SampleB();
        SampleA sa=new  SampleA();
        sa=sb;		
        System.out.println(sa.getClass());       		
        System.out.println(sb.getClass());
        		
	}

}

class SampleA{}
class SampleB extends SampleA{}
