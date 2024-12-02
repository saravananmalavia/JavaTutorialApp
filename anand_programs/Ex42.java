import java.util.Scanner;
class Ex42{
	public static void main(String[] str){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			if (i%2==0)
				continue;
			System.out.print(i + " ");
		}
	}
}


