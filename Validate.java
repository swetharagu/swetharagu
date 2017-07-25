package guvi;
import java.util.Scanner;
public class Validate {
   public static void main(String[] args){
   Scanner s=new Scanner(System.in);
   String in=s.nextLine();
   String out = in.replaceAll("(.)(?=\\1)", "$1*");
   System.out.println(out);
   }
		   }
   
