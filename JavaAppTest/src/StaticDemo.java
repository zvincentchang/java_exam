
public class StaticDemo {
     String st="ST Demo";
    public static void main(String[] args) {
        // TODO code application logic here
        StaticDemo obj = new StaticDemo();
        obj.demo1();
        demo1();
        String z=demo2(1);
        Student s1=new Student();
        s1.setName("Amy");
        change(s1);
        System.out.println(s1.getName());
        int a=10;
        change(a);
        System.out.println(a);
    }

   static  void demo1() {
       StaticDemo obj = new StaticDemo();
        System.out.println(obj.st);
        int var=1;
        boolean  b=var++>1;
        
    }
   static String demo2(int x){
       String[]  y={"A","B","C"};
       return y[x];   
   }
   static void change(Student s){
       s=new Student();
       s.setName("XXX");
   }
    static void change(int  s){
       s++;
   }
}
