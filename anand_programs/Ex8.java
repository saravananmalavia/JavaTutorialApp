class Ex8{
	public static void main(String args[]){
		int x=10;
		int y=20,z=30;
		y = x++ + 10;  
		z = ++x + 5;   
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("z="+z);
	}
}