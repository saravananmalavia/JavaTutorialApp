class ThreadDemo1{
	public static void main(String args[]){

		Table table = new Table();
		table.start();

		System.out.println(Thread.currentThread().getName());
		int	n = 8;
		for(int i = 1; i <=10;i++){
				System.out.println(i + " * " + n + " = " + (i * n));

				try{
		 		Thread.sleep(500);
			}catch(InterruptedException e){
				System.out.println(e);
		 	} 

		}

	}

	

	
}

class Table extends Thread{


	public void run(){
		int n = 5;
		for(int i = 1; i <=10;i++){
			System.out.println(i + " * " + n + " = " + (i * n));

			try{
		 		Thread.sleep(500);
			}catch(InterruptedException e){
				System.out.println(e);
		 	} 

		}

	}

}


		 

