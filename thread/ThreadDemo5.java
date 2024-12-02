class ThreadDemo5{
	public static void main(String args[]){

		Table table5 = new Table(5);
			  table5.setPriority(Thread.MAX_PRIORITY);
		 	  table5.setName("TABLE 5");
			  table5.start();
		Table table7 = new Table(7);
			  table7.setPriority(Thread.MIN_PRIORITY);
			  table7.start();

		

		System.out.println("table 5 Priority :" + table5.getPriority());
		System.out.println("TABLE NAME :" + table5.getName());
		System.out.println("table 7 Priority :" + table7.getPriority());

			 //  try{
			 //  		table5.join();
				// }catch(InterruptedException e){
				// 	System.out.println(e);
				// } 

	
		
	}
}
class Table extends Thread{
	int n;

	public Table(int n){
		this.n = n;
	}

	public void run(){
		System.out.println( n + " Table ");
		execute();
	}
	public void execute(){
		
		for(int i = 1; i <=5;i++){
			System.out.println(i + " * " + n + " = " + (i * n));

		// try{
		// 	Thread.sleep(500);
		// }catch(InterruptedException e){
		// 	System.out.println(e);
		// } 
	
		}
		
	}

}
