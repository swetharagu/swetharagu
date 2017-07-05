package guvi;
import java.util.Scanner;
public class sumofnumber {
public static void main(String[] args){
	int n,sum=0;
	Scanner ss=new Scanner(System.in);
	System.out.println("enter the number");
	int num=ss.nextInt();
	while(num!=0){
		n=num%10;
		sum=sum+n;
		num=num/10;
		}
	System.out.println(sum);
}
}
