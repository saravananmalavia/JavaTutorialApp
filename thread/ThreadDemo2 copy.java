class ThreadDemo2{
	public static void main(String args[]){

		Table table1 = new Table(5);
		table1.start();

		Table table2 = new Table(7);
		table2.start();

		Hello hello = new Hello();
		hello.start();

		Table table3 = new Table(12);
		table3.start();

		}

	}



class Table extends Thread{
	int n ;

	public Table (int n){
		this.n = n;
	}

	public void run(){
		
		for(int i = 1; i <=5;i++){
			System.out.println(i + " * " + n + " = " + (i * n));

			try{
		 		Thread.sleep(500);
			}catch(InterruptedException e){
				System.out.println(e);
		 	} 

		}

	}

}

class Hello extends Thread{
		public void run(){
			for(int i = 1;i<10;i++){
				System.out.println("Hi, I am from Heloooo");
				
				try{
		 		Thread.sleep(1000);
				}catch(InterruptedException e){
					System.out.println(e);
			 	} 	
			}
			
		}

}


		 

