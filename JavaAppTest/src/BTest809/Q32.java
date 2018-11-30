package BTest809;
class ImageScanner implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Scanner Closed");
    }
   public void scanImage()  throws Exception{
       System.out.println("Scan...");
       throw new Exception("Unable to Scan");
   }    
}
class ImagePrinter implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Printer Closed");
    }
   public void printImage()  {
       System.out.println("Print...");
   }   
}
public class Q32 {
    public static void main(String[] args){
        try(
                ImageScanner ir=new ImageScanner();
                ImagePrinter  iw=new ImagePrinter())
            {
                ir.scanImage();
                iw.printImage();
            }catch(Exception ex){
                System.out.println("error :"+ex.getMessage());
            }
    }
}
