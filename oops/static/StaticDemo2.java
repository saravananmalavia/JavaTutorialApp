import java.util.*;
class StaticDemo2{
	int val1;   // all data members will be assigned with deafult value
	static int val2;

	public static void main(String args[]) {
		StaticDemo2 s1 = new StaticDemo2();
		StaticDemo2 s2 = new StaticDemo2();
		StaticDemo2 s3 = new StaticDemo2();
		s1.increment();
		s2.increment();
		s3.increment();


		// System.out.println("main non static val1 : " + s1.val1);
		// //System.out.println("main non static val1 : " + val1);
		// //non-static variable val1 cannot be referenced from a static context
		// System.out.println("main static s1.val2 : " + s1.val2);
		// System.out.println("main static s2.val2 : " + s2.val2);
		// System.out.println("main static s3.val2 : " + s3.val2);
		// System.out.println("main static StaticDemo1.val2 : " + StaticDemo2.val2);
		// System.out.println("main static val2 : " + val2);


		s1.testMethod1();

		testMethod2();



	}

	public void increment(){
		this.val1 ++;
		val2 ++;

		System.out.println("non static val1 : " + val1);
		System.out.println("static val2 : " + val2);
		testMethod2();
	}

	public void testMethod1(){
		increment();
		testMethod2();
	}
	public static void testMethod2(){
		// increment();
		// error: non-static method increment() cannot be referenced from a static context
	}










}