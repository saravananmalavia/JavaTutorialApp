class NestedForDemo{

	public static void main(String[] args) 
	{



	for(int i=1;i<=10;i++){
			System.out.println(" i " + i);
			for(int j=1;j <=5; j++)
				{
					
					System.out.print(" " + j);
				}
		 			System.out.println();

		 			if(i == 4){
						break ;	
					}
		}
		 
	}
}



		// for(int j= 1; j<=10;j++){
		// 	for(int i=1;i <=5; i++)
		// 		{
		// 			System.out.print(" * ");
		// 		}
		// 			System.out.println();
		// }