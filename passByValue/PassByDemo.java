class PassByDemo{
	int xyz;
	public static void main(String args[]){

		// int x = 10;
		 PassByDemo p1 = new PassByDemo();
		// p1.xyz =100;
		// p1.change(x);
		// System.out.println("x :" + x);

		// PassByDemo p2 = new PassByDemo();

		// System.out.println("xyz 1:" + p1.xyz);

		// 		p2.increment(p1);
		// System.out.println("xyz 3:" + p2.xyz);

		// System.out.println("xyz 3:" + p1.xyz);


		// int values[]={1,2,3,4};

		// System.out.println("values before calling themethod");
		// for(int v :values){
		// 	System.out.print(v + " ");
		// }

		// p1.changeValue(values);

		// System.out.println("values after calling themethod");
		// for(int v :values){
		// 	System.out.print(v + " ");
		// }

		 String name = new String("Keltron");
		 System.out.print("before name :" + name);
		 p1.changeContent(name);
		 System.out.print("after name :" + name);




	}


	public  void change(int y){
		y = y + 10;
		System.out.println("y :" + y);
	}

	public  void changeContent(String s){
		s +=  " welcome";
		System.out.println("s :" + s);
	}

	public  void increment(PassByDemo p){

		p.xyz = 100 +20;
		System.out.println("xyz 2: " + p.xyz);
	}

	public void changeValue(int val[]){

		for(int i=0;i<val.length;i++){
			val[i]+=10;
		}
		System.out.println("values with  in method");
		for(int v :val){
			System.out.print(v + " ");
		}

	}












	
}
