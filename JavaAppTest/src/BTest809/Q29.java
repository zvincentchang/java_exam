/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BTest809;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Book implements Comparator<Book>{
    String name;
    double price;

    @Override
    public int compare(Book o1, Book o2) {
       return o1.name.compareTo(o2.name);
    }
    public String toString(){
        return name+":"+price;
    }
    public Book(String n , double d){
        name=n;
        price=d;
    }
    public Book(){}
}

public class Q29 {
  
    public static void main(String[] args) {
       List<Book> data=Arrays.asList(new Book("Beginning Java",2),new Book("A Guide to java",3));
       Collections.sort(data,new Book());
       System.out.println(data);
    }

}
