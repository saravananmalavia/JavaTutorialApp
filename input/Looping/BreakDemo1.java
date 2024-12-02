public class BreakDemo1 {  
	public static void main(String[] args) {


		System.out.println("Before break for loop");

		for(int i=1; i<=10; i++){
			
			if(i==7	){
				break;
			}
			System.out.println(i);
		}

		System.out.println("After break for loop");

		System.out.println("Before continue for loop");
		for(int i=1; i<=10; i++){
			
			if(i==7	){
				continue;
			}
			System.out.println(i);

		}

		System.out.println("After continue for loop");


	}
}