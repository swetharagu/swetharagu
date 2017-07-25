package guvi;
import java.util.Scanner;
public class revvowel {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	String str=s.next();
	String reverse=new StringBuffer(str).reverse().toString();
	System.out.println(reverse);
String str1=reverse.replaceAll("[aeiouAEIOU]","");
System.out.println(str1);
}
}
