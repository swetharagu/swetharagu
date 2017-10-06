package www;
import java.util.Scanner;
public class Duplicates {
public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		char[] ch=str.toCharArray();
		int c=0;
		boolean flag=true;
		for(int i=0;i<str.length();i++){
			flag=true;
			c=0;
			 for(int j=0;j<i;j++){
				 if(ch[i]==ch[j]){
					 flag=false;
					 }
			 }
			if(flag){
				for(int k=0;k<str.length();k++){
					if(ch[i]==ch[k]){
						c++;
					}
				}
		System.out.println(ch[i]+" "+c);
						}
			 }
	}
	}


