abstract class Logger{
	
	public abstract void doLog();
}
class ConsoleLogger extends Logger{
	
	public void doLog(){
		System.out.println("Console");
	}
}
class FileLogger extends Logger
{
	public void doLog(){
		System.out.println("File");
	}
	
}
class DBLogger extends Logger
{
	public void doLog(){
		System.out.println("DB");
	}
}




