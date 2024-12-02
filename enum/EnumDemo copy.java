enum Season { WINTER, SPRING, SUMMER, FALL } 

class EnumDemo{  
		//defining the enum inside the class  
		//enum Season { WINTER, SPRING, SUMMER, FALL } 
		//main method  
public static void main(String[] args) {  
		//traversing the enum 



		Season season1 = Season.WINTER;
		//System.out.println(season1); 

		for (Season s : Season.values()) { 
			System.out.println(s);  
		}

		System.out.println("Value of WINTER is: "+Season.valueOf("WINTER"));  
		System.out.println("Index of WINTER is: "+Season.valueOf("WINTER").ordinal());  
		System.out.println("Index of SUMMER is: "+Season.valueOf("SUMMER").ordinal());  
	}  
}