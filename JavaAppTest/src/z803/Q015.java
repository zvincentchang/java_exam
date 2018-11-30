package z803;

public class Q015 {
     int num;
	public static void graceMark(Q015 obj)
	{
		obj.num +=10;
	}
     public static void main(String[] args) {
		// TODO Auto-generated method stub
        Q015 obj1=new Q015();
        Q015 obj2=obj1;
        Q015 obj3=null;
        obj2.num=60;
        graceMark(obj2);
        
	}
  // Q: How many objects are created in memory at runtime?
}
