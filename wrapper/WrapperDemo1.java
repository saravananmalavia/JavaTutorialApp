class WrapperDemo1{
	public static void main(String args[]){

		Integer i1 = new Integer(10);
		changeValue(i1);
		System.out.println(" i1 " + i1);

	}

	static void  changeValue(Integer objI){
		objI = objI + 10;
		System.out.println("objI " + objI);
	}
}