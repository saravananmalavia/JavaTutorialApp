import java.util.*;
class StaticDemo1{
	int val1;   // all data members will be assigned with deafult value
	static int val2;

	public static void main(String args[]) {
		StaticDemo1 s1 = new StaticDemo1();
		StaticDemo1 s2 = new StaticDemo1();
		StaticDemo1 s3 = new StaticDemo1();
		s1.increment();
		s2.increment();
		s3.increment();


		System.out.println("main non static val1 : " + s1.val1);
		//System.out.println("main non static val1 : " + val1);
		//non-static variable val1 cannot be referenced from a static context
		System.out.println("main static s1.val2 : " + s1.val2);
		System.out.println("main static s2.val2 : " + s2.val2);
		System.out.println("main static s3.val2 : " + s3.val2);
		System.out.println("main static StaticDemo1.val2 : " + StaticDemo1.val2);
		System.out.println("main static val2 : " + val2);
	}

	public void increment(){
		val1 ++;
		val2 ++;

		System.out.println("non static val1 : " + val1);
		System.out.println("static val2 : " + val2);

	}
}