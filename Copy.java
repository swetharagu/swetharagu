package priya;

import java.util.Scanner;

public class Copy {
public static void main(String[] args) {
	//String s="";
	String ans="";
	char ch	;
	int i=0;
	Scanner sc=new Scanner(System.in);
       String s = sc.nextLine();
	int l=s.length();
	s+=" ";			
	ch=s.charAt(0);	
	while(i<l)
	{			 
		ans= ans+ ch;  

		while(s.charAt(++i)==ch && i<l)
		{}
	ch=s.charAt(i);	
	}

	System.out.println(ans);
	}
    
}

