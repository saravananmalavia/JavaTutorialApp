class ThreadDemo4{
	public static void main(String args[]){

		Table table5 = new Table(5);

		
			  table5.start();
			

			  try{
			  		table5.join();
				}catch(InterruptedException e){
					System.out.println(e);
				} 

		Table table7 = new Table(7);
			  table7.start();

		
		
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
