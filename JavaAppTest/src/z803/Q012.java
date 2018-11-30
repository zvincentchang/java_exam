package z803;

public class Q012 {
    private int x=0;
    private int y=0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Q012 obj=new Q012();
        obj.printThis(1,2);
        obj.printThat(3,4);
	}
   public void printThis(int x,int y)
   {
	   x=x;
	   y=y;
	   System.out.println("x="+this.x+" , y="+this.y);
   }
   public void printThat(int x,int y)
   {
	   this.x=x;
	   this.y=y;
	   System.out.println("x="+this.x+" , y="+this.y);
   }
}
