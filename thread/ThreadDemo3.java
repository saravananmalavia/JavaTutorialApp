class ThreadDemo3{
	public static void main(String args[]){

		Job1 job1 = new Job1();
			  job1.start();
		Job2 job2 = new Job2();
			  job2.start();

	}
}
class Job1 extends Thread{

	public void run(){
		System.out.println("I am from Job1");
		execute();
	}
	public void execute(){
		try{
			Thread.sleep(5000);
		}catch(InterruptedException e){
			System.out.println(e);
		}  


		for(int i= 0; i<=10;i++){
			System.out.println("Thread Job 1 i : " + i);
		}
		System.out.println("Thread Job 1 completed ");
	}



}
class Job2 extends Thread{

	public void run(){
		System.out.println("I am from Job2");
		execute();
	}
	public void execute(){
		try{
			Thread.sleep(10000);
		}catch(InterruptedException e){
			System.out.println(e);
		}  
		for(int i= 0; i<=10;i++){
			System.out.println("Thread Job 2 i : " + i);
		}

		System.out.println("Thread Job 2 completed ");
	}


}
