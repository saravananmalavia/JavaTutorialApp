class CallByDemo {
	public static void main(String args[]) {
		int x = 10 ;
		int values[] ={1,2,3,4,5,6};

		System.out.println("Before calling the method ");


		System.out.println("x : " + x);
		for(int i : values) {
			System.out.print(i + " ");
		}

		//x - passing copy of the x pass by value
		//values[] -- passing the address pass by ref
		CallByDemo.chageValues(x,values);

		System.out.println("After calling the method ");
		System.out.println("x : " + x);
		for(int i : values) {
			System.out.print(i + " ");
		}

	}

	public static void chageValues(int y,int numbers[]) {
		
		System.out.println("\nWith in the method ");
		System.out.println("y : " + y);
		for(int i : numbers) {
			System.out.print(i + " ");
		}


		y = 100;
		numbers[0]=500;

		System.out.println("\nWith in the method After change");
		System.out.println("y : " + y);
		for(int i : numbers) {
			System.out.print(i + " ");
		}

		
	}
}