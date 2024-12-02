
interface ILog{
	public void doLogger();
}
class FileLogger implements ILog{
	public void doLogger(){
		System.out.println("Writting the log to File");
	}
}
class DBLogger implements ILog{
	public void doLogger(){
		System.out.println("Writting the log to DB");
	}
}

class CloudLogger implements ILog{
	public void doLogger(){
		System.out.println("Writting the log to Cloud");
	}
}

class TestLogger{

	public static void main(String args[]){
		ILog iLog1 = new FileLogger();
		ILog iLog2 = new DBLogger();
		log(iLog1);
		log(iLog2);
	}
	public static void log(ILog iLog){
		iLog.doLogger();
	}
}
