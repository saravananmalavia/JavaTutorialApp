class ThreadDemo1{
	public static void main(String args[]){

		Task1 task1 = new Task1();
			  task1.start();

	}
}

class Task1 extends Thread{

	public void run(){
		System.out.println("I am from task1");
	}
}

