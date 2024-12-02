interface iFile{
	public void log();
	public void display(){
		
	}
}
interface iDB{
	public void log();
}

class  Logger implements iFile,iDB{
	public void log(){
		System.out.println("I am from log method");
	}

}





class TestInterface2{

	public static void main(String[] args) {
			Logger logger1 = new Logger();
			 logger1.log();

	}
}

/*
class A{
	mathod1(){
	
	}
}
class B{
	mathod1(){
	
	}
}
class C extends A,B{

	C c1 = new C();
	c1.mathod1();

}
*/
