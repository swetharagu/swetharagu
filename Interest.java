package prp;
import java.util.Scanner;
public class Interest {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int p=s.nextInt();
	int n=s.nextInt();
	int r=s.nextInt();
	int d=((p*n*r)/100);
	System.out.println(d);
}
}
