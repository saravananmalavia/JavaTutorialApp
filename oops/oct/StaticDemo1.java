class StaticDemo1{
	public static void main(String args[]){

		ABC a1 = new ABC();
		ABC a2 = new ABC();
		ABC a3 = new ABC();

		a1.i++;
		a1.j++;

		System.out.println(" a1.i " + a1.i);
		System.out.println(" a1.j " + a1.j);

		a2.i++;
		a2.j++;

		//ABC.i++;
		ABC.j++;

		System.out.println(" a2.i " + a2.i);
		System.out.println(" a2.j " + a2.j);

		a3.i++;
		a3.j++;

		System.out.println(" a3.i " + a3.i);
		System.out.println(" a3.j " + a3.j);

		System.out.println(" a1.i " + a1.i);
		System.out.println(" a1.j " + a1.j);
		
		
			
	}
}

class ABC{

	int i = 10;
	static int j = 10;



}