class StaticDemo{


	public static void main(String args[]){

		sum(10,20);
		sum(10,20,30,40);
		sum(10);

	}

	public static void sum(int... x){
		int sum=0;
		for(int i=0;i<x.length;i++){
			sum += x[i];
		}

		System.out.println("Sum "+sum);

	}

	
}

