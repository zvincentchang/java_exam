/* File name: Stack.java */
/* 使用堆疊處理資料--新增、刪除、輸出 */

package Chapter03;

import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException;

class Stack {
	int MAX = 10;
	String[] st = new String[20];
	int top;
	static Scanner keyboard = new Scanner(System.in);

	Stack() { // 建構函數
		top = -1;
	}
	
    // 新增函數
	public void  push_f() 
	{  
		if(top >= MAX-1)   // 當堆疊已滿，則顯示錯誤
			System.out.print("\n     堆疊是滿的!\n");
		else {
			top++;
			System.out.print("\n請輸入一筆資料(字串的格式): ");
   			st[top] = keyboard.next();     	              
		}
		System.out.println("");	
	}

    // 刪除函數
	public void pop_f() 
	{
		if(top < 0)  // 當堆疊沒有資料存在，則顯示錯誤
			System.out.print("\n     堆疊是空的 !\n");
		else { 
			System.out.printf("\n   %s 已被刪除!\n", st[top]);
			top--;               
		}
		System.out.println(""); 
	}
	
    // 輸出函數
	public void list_f() 
	{
		int count=0, i=0;

		if(top < 0)
			System.out.print("\n       The stack is empty !\n");
		else {
			System.out.print("\n\n  堆疊有下列的資料: \n");
			System.out.print(" ------------------\n");
			for(i = top; i >= 0; i--) {
				System.out.print("  "); 
				System.out.println(st[i]);
				count++;
			}
			System.out.print(" ------------------\n");
			System.out.print("  堆疊共有 " + count + "筆資料。\n\n");         
		}
		System.out.println(""); 
	} 

    // 主函數
	public static void main (String args[]) 
	{ 		 
		int option=0;  	   
		Stack obj = new Stack();
		do {			 
			System.out.println(" *****************************");
  			System.out.println("        <1> 插入 (push)");
			System.out.println("        <2> 刪除 (pop)");		       
			System.out.println("        <3> 列出");
			System.out.println("        <4> 退出");
 			System.out.println(" *****************************");
			System.out.print("   請選擇您要執行的項目: ");		
			
			try {
				option = keyboard.nextInt();
			} catch(InputMismatchException e) {
				keyboard.nextLine();
				System.out.printf("請輸入正確的選項\n");
			}
			switch(option) {			   
				case 1 :
					obj.push_f(); // 新增函數
					break;
				case 2 :
					obj.pop_f();  // 刪除函數
					break;
				case 3 :
					obj.list_f(); // 輸出函數
					break;			      
				case 4 :
					System.exit(0);	
			}			
		} while (true);
	}
}