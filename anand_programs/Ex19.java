import java.util.Scanner;
class Ex19{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if (a>b){
			if (a>c)
				System.out.println("A is greatest : " + a);	
			else
				System.out.println("C is greatest : " + c);
		}
		else if (b>c){
			System.out.println("B is greatest : " + b);
		}
		else {
			System.out.println("C is greatest : " +c);
		}
	}
}


