public class NestedLoopDemo {  
	public static void main(String[] args) {  

		for(int i=1;i<=5;i++){
			System.out.println("i = " + i);
			System.out.print("j = ");
				for(int j=10;j<=50;j+=10){
				System.out.print(j + " ");
			}

			System.out.println();
		}
	}
}

/*
i = 1
j = 10 20 30 40 50
i = 2
j = 10 20 30 40 50
i = 3
j = 10 20 30 40 50
i = 4
j = 10 20 30 40 50
i = 5
j = 10 20 30 40 50

*/