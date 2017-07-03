package dfs;

import java.util.Scanner;

public class logic {
	public static void main(String[] args){
	      Scanner sc=new Scanner(System.in);
	      String s1;
	      String S2 = new String();
	  System.out.println("enter the string:");    
	    String S1=sc.next();
	      S2=new StringBuffer(S1).reverse().toString();
	      
	     
	     
	      System.out.println("String after reverse: "+S2);
	   }
	}
	    
	   
