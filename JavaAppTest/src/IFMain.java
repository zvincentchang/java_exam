
public class IFMain {
  
    public static void main(String[] args) {
       int x=(int)(Math.random()*10)+1;
       int y=(int)(Math.random()*10)+1;
       String msg="";
       if(x>y)
           msg=x+">"+y;
       else if(x<y)
           msg=x+"<"+y;
       else
           msg=x+"="+y;
       System.out.println(msg);
    }

}
