class ThreadDemo3{
	public static void main(String args[]){

		Table table5 = new Table(5);

		
			  table5.start();

			Table table7 = new Table(7);
			  table7.start();

			table5.yield();

			  


		
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

		try{
			Thread.sleep(5000);
		}catch(InterruptedException e){
			System.out.println(e);
		} 
	
		}
		
	}

}
/*
class XYZ{
//common resource 
	 print(){
		1
		2
		3
		4
		5
		6
		7
		8
		9
		10
	}
}


therad1.methodA(){
	synchronized{
		print2()
		print1()
	}
}



therad2.methodB(){
	synchronized(){
		print1()
		print2()
	}
}

*/



