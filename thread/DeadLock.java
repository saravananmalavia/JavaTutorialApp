










class T1
{
	T2 t2;
synchronized method1(){
        ......
         ......
         .....
		t2.method2();
			}
}

class T2
{	
	T1 t1;
synchronized method2(){
		......
         ......
         .....
		t1.method1();
	}
}

main(){
	
   T1 t3 ;
	   t3.method1();

	T2 t4 ;
	   t4.method2();
}







