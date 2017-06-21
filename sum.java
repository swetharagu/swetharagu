package guvi;
import java.util.Scanner;
public class sum {
public static void main(String[] args){
	int i=1,sum=0;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	 int x = s.nextInt();
	while(i<=x){
		sum=sum+i;
		i++;
		}
System.out.println(sum);
}
}
