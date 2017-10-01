package list;
import java.util.Scanner;
public class Sum {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
    String str=s.next();
    for(int i=0;i<str.length();i++) {
    	char ch=str.charAt(i);
    	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='O'||ch=='U') {
    		System.out.print(ch);
    	}
   }
   String r=str.replaceAll("[aeiou]","");
   System.out.println(" ");
System.out.print(r);
}
}