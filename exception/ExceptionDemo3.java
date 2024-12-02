import java.util.*;
class ExceptionDemo3{
	public static void main(String args[]){
		int count=0,sum = 0; 

		String result="";
		System.out.println("The values are ");
		for(int i=0;i<args.length;i++){

			try{
				System.out.print(args[i] + " ");
				
				sum += Integer.parseInt(args[i]);
				
			}catch(Exception e){
				//System.out.print("Invalid element " + args[i] + " ");
				result += args[i];
				count ++;
			}
		}
		System.out.println();
		System.out.println("   sum : " + sum);
		System.out.println("   Invalid count : " + count);
		System.out.println("   result : " + result);

		//int avg = sum/(10-5*2);

		//System.out.print("   avg : " + avg);
	}
}