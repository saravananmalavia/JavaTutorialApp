public class BreakDemo2 {  
	public static void main(String[] args) {


		System.out.println("Before break for loop");

			xyz : for(int i=1;i<=5;i++){
			System.out.println("i = " + i);
			System.out.print("j = ");
					for(int j=10;j<=50;j+=10){
				System.out.print(j + " ");

					if(j == 30) {

						if((j == 30) && (i == 2)){
							break xyz;
						}

						break;
					}

					
			}

			System.out.println();
		}

		System.out.println("After break for loop");
	}
}