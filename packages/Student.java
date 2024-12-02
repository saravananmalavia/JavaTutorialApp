package stm;

import helper.*;
import helper.util.*;
//import helper.Utility;
import stm.staff.TeachingStaff;

public class Student{

	public static void main(String args[]){
		int mark1, mark2, total;

		System.out.println("Enter the Mark 1 : ");
		mark1 = Help.getI();
		System.out.println("Enter the Mark 2 : ");
		mark2 = Help.getI();
		total = helper.Utility.add(mark1, mark2);
		//total = Utility.add(mark1, mark2);

		System.out.println("Mark 1 : " + mark1);
		System.out.println("Mark 2 : " + mark2);
		System.out.println("Total : " + total);

		TeachingStaff.display();



	}
}