import java.util.Scanner;
class Ex18{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		if (a>b){
			System.out.println("A is greatest : " + a);	
		}
		else if (a==b){
			System.out.println("A equal to B : " + a);
		}
		else {
			System.out.println("B is greatest : " +b)
		}
	}
}


