import java.util.Scanner;

class CustomExceptionDemo{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int mark1;
		try{

			System.out.println("Enter the mark between 0-100");
			mark1 = sc.nextInt();
			if(mark1 < 0 || mark1 > 100){
				throw new MarkOutOfBoundException();
			}
			System.out.println("Mark1 " +mark1);
		}
		catch(MarkOutOfBoundException e){

		}
	
	}

}


class MarkOutOfBoundException extends Exception{
	public MarkOutOfBoundException(){
		System.out.println(" MarkOutOfBoundException ");
	}

}