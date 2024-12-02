import java.util.Scanner;
class Ex41{
	public static void main(String[] str){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n=sc.nextInt();
		for(int i=1;;i++){
			System.out.print(i + " ");
			if (i==n)
				break;
		}
	}
}


