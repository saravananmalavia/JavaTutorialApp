import java.util.Scanner;
class Ex13{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		String c=(a>b)? "A is greatest" : "B is greatest";
		System.out.println(c);
			
	}
}


