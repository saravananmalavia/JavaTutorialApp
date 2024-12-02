class StaticDemo4{
	public static void main(String args[]){



		Values valuesObj1;

		valuesObj1 = new Values();
		Values valuesObj2 = new Values();
		Values valuesObj3 = new Values();

		valuesObj1.doIncrement();
		valuesObj2.doIncrement();
		valuesObj3.doIncrement();

		System.out.println(" valuesObj1 j : " + valuesObj1.j);
		System.out.println(" valuesObj2 j : " + valuesObj2.j);
		System.out.println(" valuesObj3 j : " + valuesObj3.j);

		System.out.println(" Values j : " + Values.j);
		//System.out.println(" Values i : " + Values.i);

		//Values.doDecrement();



	}
}

class Values{
	int i = 10;
	static int j = 10;

	static {
		System.out.println("I am with in static block");
		j = 30;
	}	

	public Values(){
		System.out.println("I am with in constructor");
		 i = 20;
		 	
	}


	public void doIncrement(){
		i ++;
		j ++;

		System.out.println(" i : " + i);
		System.out.println(" j : " + j);

	}

	// public static void doDecrement(){
	// 	//i --; studentId =10;
	// 	j --;

	// 	//System.out.println(" i : " + i);
	// 	System.out.println(" j : " + j);

	// }




}