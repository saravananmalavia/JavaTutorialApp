import java.util.*;
class CmdLineDataPassing{
	public static void main(String args[]){

		// args = {"10","20","30","40"};
		// args = {10,20,30,40};
		// args[0] + args[1] 1020

		int sum = 0; 
		//String result="";
		System.out.println("The values are ");
		for(int i=0;i<args.length;i++){
			//result += args[i];
			sum += Integer.parseInt(args[i]);
			System.out.print(args[i] + " ");

		}
		System.out.print("   sum : " + sum);
		//System.out.print("   result : " + result);

		//int avg = sum/(10-5*2);

		//System.out.print("   avg : " + avg);
	}
}

"10" "20"