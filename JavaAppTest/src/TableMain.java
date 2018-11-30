
public class TableMain {
  
    public static void main(String[] args) {
         for(int x=1;x<=9;x++){
               for(int y=1;y<=9;y++){
                   String st=x+"x"+y+"="+x*y;
                   System.out.print(st+"\t");
               }
               System.out.println();
         }
    }

}
