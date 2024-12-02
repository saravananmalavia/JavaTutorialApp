public class BreakDemo3 {  
	public static void main(String[] args) {


		System.out.println("Before break for loop");

			xyz : for(int i=1;i<=5;i++){
			System.out.println("i = " + i);
			System.out.print("j = ");
				for(int j=10;j<=50;j+=10){
				System.out.print(j + " ");

					if(j == 30) {
						break xyz;
					} 					
			}

			System.out.println();
		}

		System.out.println("After break for loop");
	}
}