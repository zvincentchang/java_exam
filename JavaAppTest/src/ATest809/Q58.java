/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ATest809;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;


public class Q58 {
  
    public static void main(String[] args) {
       Locale locale=new Locale.Builder().setLanguage("fr").setRegion("FR").build();
       
       ResourceBundle res=ResourceBundle.getBundle("ATest809.Messages",locale);
       Enumeration<String> names=res.getKeys();
       while(names.hasMoreElements()){
           String k=names.nextElement();
           String n=res.getString(k);
          System.out.println(k+":"+n);
       }
    }

}
