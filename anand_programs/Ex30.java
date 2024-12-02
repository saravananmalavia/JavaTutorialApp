import java.util.Scanner;
class Ex30{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n=sc.nextInt();
		int i,x,s=0;
		System.out.println("Enter the numbers");
		for(i=1;i<=n;i++){
			x=sc.nextInt();
		    s+=x;
		}
		System.out.print("The sum is "+s);
	}
}


