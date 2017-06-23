package guvi;
import java.util.*;
public class number {
public static void main(String a[])
	{
	int n;
	System.out.println("Enter total no of values in the array");
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	int a1[]=new int[n];
	for(int i=0;i<n;i++)
	a1[i]=s.nextInt();
	for(int i=1;i<n;i++)
	{
	  for(int j=0;j<i;j++)
	  {
	    if(a1[j]==a1[i])
	    System.out.println(a1[j]+"");
	    break;
	  }
	  break;
	}
	}
	}

