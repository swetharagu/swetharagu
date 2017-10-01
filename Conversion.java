package list;

import java.util.Scanner;

public class Conversion {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String str=s.nextLine();
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(Character.isUpperCase(ch)) {	
	System.out.print(Character.toLowerCase(ch));
}
		else if(Character.isLowerCase(ch)) {	
			System.out.print(Character.toUpperCase(ch));
		}
		
		}
}
}		
	


