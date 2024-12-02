import java.util.Scanner;
class Ex16{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks");
		int m1,m2,m3,m4,m5;
		int tot;
		float avg;
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		m4=sc.nextInt();
		m5=sc.nextInt();
		tot=m1+m2+m3+m4+m5;
		avg=tot/5.0f;
		System.out.println("Total = "+tot);
		System.out.println("Average = "+avg);
	}
}


