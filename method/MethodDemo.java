class MethodDemo {
	public static void main(String args[]) {
		int val1 ;
		int val2;
		int val3;

		val1 = 10;
		val2 = 20;
		// val3 = val1 + val2;
		// System.out.println("Result : "+ val3);

		// val3 = findSum(val1,val2);
		// //MethodDemo.findSum(20,35);
		// System.out.println("Result : "+ val3);

		val3 = TestSum.findSum(val1,val2);
		// TestSum t1 = new TestSum();
		// val3 = t1.findSum(val1,val2);

		System.out.println("Result : "+ val3);

	}
	
}
class TestSum {

	public static  int findSum(int v1,int v2){
		// int v3;
		// v3 = v1 + v2;
	
		// return v3;
		return v1+v2;
		//System.out.println("Result 1: "+ v3);

	}

}





