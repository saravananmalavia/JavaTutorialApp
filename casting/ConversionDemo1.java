class ConversionDemo1{
	
	 public static void main(String args[]) {

	 	int i = 10;    // 32

	 	long l = 10; // 64

	 	i = (int) l; // explicit casting

	 	//l = i; //implicit casting

	 	//System.out.println(" i :" + i);
	 	//System.out.println(" l :" + l);

	 	 double d = 12.10; //64

	 	// 	// down casting or narrow conversion
	 	 int j = (int)d;
	 	  d =  l;
	 	// 	// up casting 
	 	// double  k  = i;

	 	// System.out.println(" i :" + i) ;
	 	// System.out.println(" j :" + j);
	     System.out.println(" d :" + d);
	     System.out.println(" l :" + l);

	 }
}
/*
00000001   - 8 
00000000 00000001 - 16 bit
*/
