import java.util.*;
public class MenuDrivenConversion {  
	public static void main(String[] args) {
		int option;

      	Scanner in = new Scanner(System.in);
      	

      	while(true){
      		System.out.println();
			System.out.println("****************************");
			System.out.println("Converting Decimal To Binary");
			System.out.println("****************************");
			System.out.println("1. Decimal To Binary");
			System.out.println("2. Binary To Decimal");
			System.out.println("3. Exit ");
			System.out.println("****************************");
			System.out.println("Enter the option (1-3)");
			System.out.println("****************************");
		
			option = in.nextInt();

			switch(option){
				case 1 :
						System.out.println("1. Decimal To Binary");
						System.out.println("**********************");

						int rem,temp,decimal,binary,p;

						System.out.println("Enter the decimal value");
				        decimal = in.nextInt();
						temp = decimal;
						binary = 0;
						p=0;

						do{
							rem = temp % 2;
							binary += rem * Math.pow(10,p);
							temp = temp / 2 ; 
							p++;
						} while (temp >0) ;

						System.out.println("The binary value of " + decimal + " is " + binary);


						break;
				case 2 : 

						System.out.println("2. Binary To Decimal");
						System.out.println("**********************");
						System.out.println("Enter the binary value");
				        binary = in.nextInt();
				        decimal = getDecimal(binary);

				        System.out.println("The decimal value of " + binary + " is " + decimal);
						break;
				case 3 : 
						System.out.println("Good Bye....");
						System.exit(0);
						break;
				default :
						System.out.println("Kindly choose the option from 1-3");
						break ;


			}
		}
		
	}


public static int getDecimal(int binary){  
    int decimal = 0;  
    int n = 0;  
    while(true){  
      if(binary == 0){  
        break;  
      } 
      else {  
          int temp = binary%10;  
          decimal += temp*Math.pow(2, n);  
          binary = binary/10;  
          n++;  
       }  
    }  
    return decimal;  
}  






}



/*
****************************
Converting Decimal To Binary
****************************
1. Decimal To Binary
2. Binary To Decimal
3. Exit 
****************************
Enter the option (1-3)
****************************
*/