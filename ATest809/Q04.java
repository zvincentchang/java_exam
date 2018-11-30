package ATest809;

class Foo<k,v>{
    private k key;
    private v value;
    public Foo(k key,v value){
        this.key=key;
        this.value=value;
    }
    public static <T> Foo<T,T> twice(T  value){
       return new Foo<T,T>(value,value);
    }

    /**
     * @return the key
     */
    public k getKey() {
        return key;
    }

    /**
     * @return the value
     */
    public v getValue() {
        return value;
    }
    
}
public class Q04 {
  
    public static void main(String[] args) {
         Foo<String,String> f1=new Foo<>("John","A");
         Foo<String,Integer> f2=new Foo<String,Integer>("John",100);
      //   Foo<Object,Object> f3=new Foo<String,Integer>("John",100);
         Foo<String,String> pair=Foo.<String>twice("Demo");
    }

}
