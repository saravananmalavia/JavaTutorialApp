interface iFile{
	public void log1();
	
}
interface iDB{
	public void log2();
}

interface iLog extends iFile,iDB{
	public void log();
}

class XYZ{

}

class  Logger extends XYZ implements iLog{
	public void log1(){

	}
	public void log2(){

	}
	public void log(){

	}

}






class TestInterface3{

	public static void main(String[] args) {
			

	}
}

