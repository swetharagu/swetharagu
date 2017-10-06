package www;
import java.util.Scanner;
public class Oddd {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b[]=new int[a];
	int sum=0;
	for(int i=0;i<a;i++){
		b[i]=s.nextInt();
	}
	for(int i=0;i<a;i++){
	if(b[i]%2==1){
		sum=sum+b[i];
	}}
	if(sum%2==0){
		System.out.println("-1");
	}
	else if(sum%2==1){
		System.out.println("1");
	}
}
}
