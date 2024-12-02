// program to find the largest of 2 numbers
import java.util.*; // package

class LargestOfTwo { //Pascal
	public static void main(String[] args){
		
		// int value1;
		// int value2;

		int value1,value2;
		// value1 = 3000;
		// value2 = 1300;

		String result;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value 1");
		value1 = sc.nextInt(); //camelCase

		System.out.println("Enter the value 2");
		value2 = sc.nextInt();

		result = sc.next(); // to get a string from console

		if(value1 == value2){
			System.out.println("value1 : " + value1  + " is equal to value2 : " + value2);
		}

		else if(value1 > value2){

			System.out.println("value1 : " + value1  + " is greater value2 : " + value2);

		}else{
			System.out.println("value2 : " + value2  + " is greater value1 : " + value1);
		}
	}
}

/*
	if(value1 == value2){

	}
	if(value1 > value2){

	}
	if(value1 < value2){

	}
	
*/

//value1 : 300 is equal to value2 : 300

// Syntax mathod
// access_modifier return_type name_method(Args list){

// }



/*
java identifier

a-z 
A-Z 
0-9 
_ 
$ 
anyLength 
should not start with number
*/