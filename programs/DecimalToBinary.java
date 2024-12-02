import java.util.*;
public class DecimalToBinary {  
	public static void main(String[] args) {
		int rem,temp,decimal,binary,p;

		Scanner in = new Scanner(System.in);
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
	}
}

/*
5 / 2 = 2 - 1
2 / 2 = 1 - 0

temp 5 2
rem  = 1
binary = ) + (1 * 10^0) + (0 * 10 ^ 1) + (1 * 10 ^ 2)

1 * 10 pow 2 + 0 * 10 pow 1 + 1 * 10 pow 0

*/






















