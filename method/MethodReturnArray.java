class MethodReturnArray{

		public static void main(String args[]){

			int numbers[];

			numbers = sort();

			for(int n:numbers){
				System.out.print(n + " ");
			}

		}

		public static int [] sort(){
			int values[]={100,200,300,400,500};
			return values;
		}
	
}