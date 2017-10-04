package project;
import java.util.Scanner;
public class Firstsum {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int sum=0,r=0,k=0;
	 r=n%10;
	while(n>1) {
      n=n/10;
		}
	 System.out.println(r+n);
}
}
