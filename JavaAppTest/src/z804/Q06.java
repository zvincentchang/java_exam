package z804;

import java.nio.file.Path;
import java.nio.file.Paths;
public class Q06 {

	public static void main(String[] args) {
        Path p=Paths.get("c:\\education\\institute\\students\\report.txt");
        System.out.printf("Path.getName(0):%s \n",p.getName(0) );
        System.out.printf("Path.subpath(0,2):%s",p.subpath(0,2) );
	}
    //Path.getName(0):education 
	//Path.subpath(0,2):education\institute
}
