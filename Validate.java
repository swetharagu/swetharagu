package guvi;
import java.util.Scanner;
public class Validate {
   public static void main(String[] args){
   Scanner s=new Scanner(System.in);
   String str=s.nextLine();
   String str2= str.replaceAll("(.)(?=\\1)", "$1*");
   System.out.println(str2);
   }
		   }
   
