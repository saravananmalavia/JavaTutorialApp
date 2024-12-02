 class AccessDemo{

	public static void main(String args[]){
		//A a1 = new A();
		A a2 = A.createObject();
			
	}
	
}

class A{
private A(){

	}

	public static A createObject(){
		A a1 = new A();
		return a1;
	}

}