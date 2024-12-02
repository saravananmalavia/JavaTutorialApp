import java.util.*;
public class SwitchCaseDemo1 {  
	public static void main(String[] args) {  

		Scanner in = new Scanner(System.in);
		char option;
		String option1;
		System.out.println("enter the value (yes/no)");
		

		//option = in.next().charAt(0);
		option1 = in.next();
			
			switch (option1) {
			  case "yes" :
			    System.out.println("YES");
			    break;
			  case "no" :
			    System.out.println("NO");
			    break;
			  
			   default :
			   	System.out.println("Not a valid input");

			   break;


			}

	}
}