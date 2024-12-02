class JumpStatement{
	public static void main(String args[]){
		for(int i = 1; i <= 10;i++){ // entry check
				
				System.out.print(i + " ");
				
				if(i == 5 ){
					break ;
				}

				System.out.print("*");
	
			}
			
		}
}

				
// 1 2 3 4 6 7 8 9 10
// 1 2 3 4 5 7 8 9 10
// 1 2 3 4 5 6 7 8 9 10