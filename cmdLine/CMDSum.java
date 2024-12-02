class CMDSum{
	public static void main(String args[]){
		// args[0] = "12"; 12 
		// args[1] = "34";
		// args[2] = "56";
		// args[3] = "78";

		int sum = 0;

		for(int i=0;i< args.length;i++)
		{
			sum = sum + Integer.parseInt(args[i]);
		}
		System.out.println("sum : " + sum);
		
	}
}
