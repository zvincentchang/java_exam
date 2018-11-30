// File name: CircleQueue.java
// 使用環狀佇列加上TAG處理資料--新增、刪除、輸出

package Chapter03;

import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException;

class CircularQueue {

	int MAX=10;    
	String[] cq = new String[MAX];
	int front,rear;
	int tag; // 當tag為0時，表示沒有存放資料，若為1，則表示有存放資料
    
    static Scanner keyboard = new Scanner(System.in);
    
	CircularQueue() { // 建構函數
		front = MAX - 1;
		rear = MAX - 1;
		tag = 0;
	}

    // 新增函數
	public void enqueue_f() 
	{
		if(front == rear && tag == 1) // 當佇列已滿，則顯示錯誤
			System.out.print("\n\n  此佇列已滿!\n");
		else {
			rear = (rear + 1) % MAX;
			System.out.print("\n請輸入一筆資料(字串格式): ");			
			cq[rear] = keyboard.nextLine();
						      			
			if(front == rear) 
				tag = 1;
		}
		System.out.println("\n");
	}

    // 刪除函數
	public void dequeue_f() 
	{ 
		if(front == rear && tag == 0)   // 當沒有資料存在，則顯示錯誤
			System.out.printf("\n   此佇列是空的!\n\n");
		else {
			front = (front + 1) % MAX;
			System.out.printf("\n %s 已被刪除!\n ", cq[front]);
			if(front == rear) 
				tag = 0;
			System.out.println("\n");
		}
	}

    // 輸出函數
	public void list_f() 
	{ 
		int count=0, i=0;

		if(front == rear && tag == 0)
			System.out.printf("\n  此佇列是空的\n\n");
		else {
			System.out.print("\n\n  佇列有下列資料\n");
			System.out.print("**********************\n");
			for(i = (front + 1) % MAX; i != rear; i = ++i % MAX) {
				System.out.print("     ");
				System.out.print(cq[i] + "\n");
				count++;
			}
			System.out.print("     ");
			System.out.print(cq[i] + "\n");
			System.out.print("**********************\n");
			System.out.print("   共有 " + (++count) + "筆資料。\n\n");
			System.out.println("");
		}   
	}

    //主函數	
	public static void main (String args[]) 
	{ 	 
		Scanner keyboard = new Scanner(System.in);
		int option=0;
		      
		CircularQueue obj = new CircularQueue();			 
		do {			 
			System.out.println("*****************************");
  			System.out.println("       <1> 插入 (enqueue)");
			System.out.println("       <2> 刪除 (dequeue)");				 
			System.out.println("       <3> 列出");
			System.out.println("       <4> 退出");
 			System.out.println("*****************************");
			System.out.print(" 請選擇您要執行的項目 : ");
			
			try {
				option = keyboard.nextInt();
			} catch(InputMismatchException e) {
				keyboard.nextLine();
				System.out.printf("請輸入正確的選項\n");
			}

			switch(option) {			   
				case 1 :
					obj.enqueue_f(); //新增函數
					break;
				case 2 :
					obj.dequeue_f(); //刪除函數
					break;			      
				case 3 :
					obj.list_f();    //輸出函數
					break;
				case 4 :
					System.exit(0);	
			}			
		} while (true);
	}
}