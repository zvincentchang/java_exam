
package BTest809;
class Foo<K,V>{
    private K key;
    private V value;
    public Foo(K key,V value){
        this.key=key;
        this.value=value;
    };
    public static <T> Foo<T,T> twice(T value){
        return new Foo<T,T>(value,value);
    }
    public K getKey(){return key;}
    public V getValue(){ return value;}
}

public class Q21 {
  
    public static void main(String[] args) {
       Foo<Object,Object> p1=new Foo<>("Steve",100);
       Foo<String,Integer> p2=new Foo<String,Integer>("Steve",100);
       Foo<String,String> p3=Foo.<String>twice("A");
    
    }

}
