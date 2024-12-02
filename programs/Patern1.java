import java.util.*;

class Patern1{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

		int n;
		do
		{
			System.out.println("Enter the no of rows");
			
			n = scanner.nextInt();

			for(int j= 1; j<=n;j++){    // 1 2
				for(int i=1;i <=j; i++) // 1 2
					{
						System.out.print(" * ");
					}
					System.out.println();
			}
		}
		while(n != 0);

	}
}