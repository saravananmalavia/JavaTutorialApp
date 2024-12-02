class InheritanceSuperDemo{
	public static void main(String args[]){

		B b1 = new B(20,30);
	
		b1.print();
	}
}

class A{
	int value1 = 10;

	public A(){

	}
	public A(int v1){
		value1 = v1;
	}

	public void print(){
		System.out.println("A value1 :" + value1);
	}
	
}
class B extends A{
	int value1 ;

	public B(){
		
	}

	public B(int value1){
		this.value1 =value1;
	}

	public B(int Avalue1, int Bvalue1){
		super(Avalue1);
		this.value1 =Bvalue1;
		
	}

	public void print(){
		//int v2 = 10;
		super.print();
		System.out.println("B value1 :" + value1);
		//System.out.println("v2:" + v2);
	}
}

