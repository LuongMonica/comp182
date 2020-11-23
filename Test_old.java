//Luong, Monica

import java.util.Scanner; 
public class Test_old {
	public static void main (String[] args) {
		
		//HW2: constructor w/ String parameter
		Fraction f = new Fraction(2, 6);
		Fraction g = new Fraction("1 2/4");
		System.out.println("Orig: f= " + f + ", g= " + g);
		
		//Program 1: division of fractions and quotient/remainder
		Fraction[] quotient_remainder = Fraction.divFraction(f, g);
		System.out.println("Result of division= " + f.toString());
		System.out.println("After: f= " + f.toString() + ", g= " + g.toString());
		System.out.println("Quotient & Remainder= " + quotient_remainder[0] + ", " + quotient_remainder[1]);
		
		//String sML = " 1/2, 6, 2 , 3/4, 2  3/2, 4/2, 5/3, 2 2/4,,,1 5/2,";
		//" 7/3, 7/8, 3/4, 7/6, 4/3,,,, 5/7"
		//Program 2: Sorting fractions
		System.out.println("");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your fractions: ");
		String s = input.nextLine();	
		System.out.println("");
		System.out.println("CleanOrig=|" + Utility.clean(s) + "|");
		//code to create an object of type Sort 
		HeapSortML obj = new HeapSortML(s);
		System.out.println("");
		System.out.println("init array of Fractions = " + obj);
		//obj.bubbleML();
		System.out.println("");
		//System.out.println("Fractions in increasing order = " + obj);
		
		//heap program
		obj.heapSortML();
		System.out.println("Fractions in increasing order = " + obj);
		
	}
}