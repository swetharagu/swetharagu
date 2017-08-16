package guvi;

import java.util.Scanner;

public class Char {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
    String ch=s.next();
	//ch=null;
	switch(ch){
	case "Monday":
		System.out.println("True");
	    break;
	case "Tuesday":
		System.out.println("True");
		break;
	case "wednesday":
		System.out.println("True");
		break;
	case "Thursday":
		System.out.println("True");
		break;
	case "friday":
		System.out.println("True");
		break;
	case "saturday":
		System.out.println("True");
		break;
	default:
		System.out.println("False");
		
		}
	}
}

