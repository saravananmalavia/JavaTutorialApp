import java.text.NumberFormat;
class NumberToWord{

	public static final String[] units = { "", "One", "Two", "Three", "Four",
			"Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
			"Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
			"Eighteen", "Nineteen" };

	public static final String[] tens = { 
			"", 		// 0
			"",		// 1
			"Twenty", 	// 2
			"Thirty", 	// 3
			"Forty", 	// 4
			"Fifty", 	// 5
			"Sixty", 	// 6
			"Seventy",	// 7
			"Eighty", 	// 8
			"Ninety" 	// 9
	};

	public static void main(String ars[]){

		int n;

		n = 5;
		System.out.println(NumberFormat.getInstance().format(n) + "='" + convert(n) + "'");

		n = 16;
		System.out.println(NumberFormat.getInstance().format(n) + "='" + convert(n) + "'");

		n = 50;
		System.out.println(NumberFormat.getInstance().format(n) + "='" + convert(n) + "'");

		n = 78;
		System.out.println(NumberFormat.getInstance().format(n) + "='" + convert(n) + "'");

		n = 456;
		System.out.println(NumberFormat.getInstance().format(n) + "='" + convert(n) + "'");

		n = 1000;
		System.out.println(NumberFormat.getInstance().format(n) + "='" + convert(n) + "'");

		n = 99999;
		System.out.println(NumberFormat.getInstance().format(n) + "='" + convert(n) + "'");

		n = 199099;
		System.out.println(NumberFormat.getInstance().format(n) + "='" + convert(n) + "'");

		n = 10005000;
		System.out.println(NumberFormat.getInstance().format(n) + "='" + convert(n) + "'");

		n = -829;
		System.out.println(NumberFormat.getInstance().format(n) + "='" + convert(n) + "'");
	
	}

	public static String convert(final int n) {


		if (n < 0) {
			return "Minus " + convert(-n);
		}

		if (n < 20) {
			return units[n];
		}

		// 75  Seventy Five
		// 30 Thirty 
		if (n < 100) {
			return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
		}
		// 100. one Hundred 
		// 829 eight Hundred  twenty nine 

		if (n < 1000) {
			return units[n / 100] + " Hundred" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
		}

		if (n < 100000) {
			return convert(n / 1000) + " Thousand" + ((n % 10000 != 0) ? " " : "") + convert(n % 1000);
		}

		if (n < 10000000) {
			return convert(n / 100000) + " Lakh" + ((n % 100000 != 0) ? " " : "") + convert(n % 100000);
		}

		return convert(n / 10000000) + " Crore" + ((n % 10000000 != 0) ? " " : "") + convert(n % 10000000);
	}

}








