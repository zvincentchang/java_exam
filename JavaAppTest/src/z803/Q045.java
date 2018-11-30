package z803;

public class Q045 {

	private char var;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char var1='a';
        char var2=var1;
        var2='e';
        Q045 obj1=new Q045();      
        Q045 obj2=obj1;
        obj1.var='i';
        obj2.var='o';
        System.out.println(var1+","+var2);
        System.out.println(obj1.var+","+obj2.var);
	}

}
