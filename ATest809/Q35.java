package ATest809;
class DataConverter implements AutoCloseable{
    public void copyFlatFiles(){}
    public void close() throws Exception{
        throw  new RuntimeException();
    }
}

public class Q35 {
  
    public static void main(String[] args) throws Exception {
       try(DataConverter dc=new DataConverter()){
           dc.copyFlatFiles();
       }
    }

}
