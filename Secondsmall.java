package www;

import java.util.Arrays;
import java.util.Scanner;

public class Secondsmall {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b[]=new int[a];
	for(int i=0;i<a;i++){
		b[i]=s.nextInt();
	}
	Arrays.sort(b);
	System.out.println(b[1]);
}
}
