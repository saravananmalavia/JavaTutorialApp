class ContinueDemo{
	public static void main(String args[]){

		int n = 5;
		for(int i = 1 ; i<=n; i++){

			System.out.println(i);
			if(i == 3){
				continue;
			}
			System.out.println("***");
			
			
		}

	}
}

/* output

1 1
2 2
3 3
5 4
  5
*/