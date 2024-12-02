import java.util.Scanner;
class Ex20{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a,b,c=0,ch;
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication");
		System.out.println("Enter your choice: ");
		ch=sc.nextInt();
		switch(ch){
			case 1: c=a+b;
				    break;
			case 2: c=a-b;
				    break;
		 	case 3: c=a*b;
		 		    break;
		 	default:
		 		    System.out.println("Invalid choice...");
		}
		System.out.println("The result is "+ c);
	}
}


