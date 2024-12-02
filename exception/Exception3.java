import java.util.Scanner;
class Exception3{
	  public static void main(String args[]) {  
	  	Scanner sc = new Scanner(System.in);
	  	int marks[] = new int[3];

	  	/*
			marks[0] = 10;
			marks[1] = -1 (i--)
			marks[2]


	  	*/

	  	System.out.println("Enter the 3 marks");

	  	for(int i=0;i<marks.length;i++){
	  		marks[i] = sc.nextInt();

	  		if(marks[i] < 0 || marks[i] > 100){
		  		try{
		  			throw new MOBException();
		  		}catch(MOBException e){
		  			System.out.println("Enter a valid mark");
		  			i--;
	  			}
	  		
	  		}
	  	}
	  	
	System.out.println("The given marks are");
	  	for(int mark : marks){
	  		System.out.println(mark);
	  	}
	  	


  }
	  
}

class MOBException extends Exception{
	public MOBException(){
		System.out.println("MOB Exception : mark should be in between 0-100");
	}

}

