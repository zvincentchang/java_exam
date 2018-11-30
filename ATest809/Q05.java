
package ATest809;

class MyClass implements AutoCloseable{

    int test;
    @Override
    public void close()  {
        
    }
    public MyClass copyObject(){
        return this;
    }
    
}
public class Q05 {
    public static void main(String[ ] args){
        MyClass obj=null;
        try(MyClass obj1=new MyClass()){
            obj1.test=100;
            obj=obj1.copyObject();
        }
        System.out.println(obj.test);
    }
}
