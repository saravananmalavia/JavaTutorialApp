class SumCmdLine{
	public static void main(String args[]){

		int sum = 0;
		// for(int i=0;i<args.length;i++){
		// 	System.out.println(args[i]);
		// }
		// for each syntax
		// for(String i : args){
		// 	System.out.println(i);
		// }

		for(int i=0;i<args.length;i++){
			sum += Integer.parseInt(args[i]);
		 }
		 System.out.println("Sum :" +sum);
	}
}