class JumpStatementLabel{
	public static void main(String args[]){

		outer1 :	
		for(int j=1; j<=10;j++){
			for(int i = 1; i <= 10;i++){ 
				
				if(i == 5 ){
					//break  outer1; 
					continue outer1; 
				}
				System.out.print(i + " ");
			}	
			System.out.println();	
		}

	}
		
}

				
// 1 2 3 4 6 7 8 9 10
// 1 2 3 4 5 7 8 9 10
// 1 2 3 4 5 6 7 8 9 10