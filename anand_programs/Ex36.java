import java.util.Scanner;
class Ex36{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n=sc.nextInt();
		int f=1;
		for(int i=1;i<=n;i++){
			f*=i;
		}
		System.out.println("The factorial is " + f);
	}
}


