import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class HelloJava {
	public static void main(String[] args) {
		/**
		 * Print 'Hello Java!!!'
		 */
		System.out.println("Hello Java!!!");
	
        Scanner scanner = new Scanner(System.in);
		
		/**
		 * Primitive type variables  
		 */

		// int type and initialization.
		System.out.println("[Integer type]");
		
		int number1 = 14;
		int number2 = number1 + 36;
		
		System.out.println("number1 = " + number1);
		System.out.println("number2 = " + number2);
		System.out.println("number1^2 - number2^2 = " + (number1*number1 - number2*number2));
		System.out.println("(number1 + number2)*(number1 - number2) = " + ((number1 + number2)*(number1 - number2)));
		System.out.println("");

		// Max/min value of int type variable
		System.out.println("[Integer max and min values & over/underflow]");
		
		int maxNumber = Integer.MAX_VALUE;
		int minNumber = Integer.MIN_VALUE;
		
		System.out.println("maxNumber = " + maxNumber + ";  minNumber = " + minNumber);
		System.out.println("maxNumber + 1 = " + (maxNumber + 1));
		System.out.println("minNumber - 1 = " + (minNumber - 1));
		System.out.println("");

		// double type & initialization
		System.out.println("[Double type]");		
		double x = 12.5;
		double y = 22.5;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("x + y = " + (x + y));

		x = 1.0 / 3.0;
		y = 2.0 / 3.0;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("x^2 - y^2 = " + (x*x - y*y) + "  or " + ((x+y)*(x-y)));
		System.out.println("");

		// char type & initialization
		System.out.println("[Char type & how to assign unicode]");
		char letter1 = 'Q';
		char letter2 = 'R';
		System.out.println("letter1, letter2 = " + letter1 + "," + letter2);
		
		letter1 = '\u0041';
		letter2 = '\u03b2';
		System.out.println("letter1, letter2 = " + letter1 + "," + letter2);
		System.out.println("");

		// String type (class) & initialization
		System.out.println("[String type (not primitive type]");
		String name = "Kyle Lee";
		String address = "123 Abc St. Melbourne, FL";
		String specialLetters = "A \u03A3 \u03b1";
		System.out.println(name);
		System.out.println(address);
		System.out.println(specialLetters);
		System.out.println("");
		
		/**
		 *  Array
		 */

		// --------------------------------------------------------------------------- 
		System.out.println("[Simple Array with literal initialization]");
		int [] idArray = {2, 3, 5, 7, 11, 13, 17, 19};
		System.out.println("idArray.length = " + idArray.length);
		System.out.println("idArray = { " + idArray + " }"); // Printing an array is not what we want.
		System.out.println("");
		
		System.out.println("[Print each array elements]");
		for (int i=0; i<idArray.length; i++) {
			System.out.println("idArray[" + i + "] = " + idArray[i]);
		}
		System.out.println("");
		
		// --------------------------------------------------------------------------- 
		System.out.println("[Simple Array with literal initialization]");
		int [] idArray2 = new int [idArray.length];
		for (int i=0; i<idArray.length; i++) {
			idArray2[i] = idArray[i];
		}
		
		System.out.println("[Print array (4 elements in a line]");
		String lines = "";
		for (int i=0; i<idArray2.length; i++) {
			if (i % 4 == 0) {
				lines += "\t";
			}

			lines += i;
			
			if ( i != (idArray2.length - 1)) {
				lines += ", ";
				if ( (i+1) % 4 == 0 ) {
					lines += "\n";
				}
			}
		}
		System.out.println("idArray2 = {");
		System.out.println(lines + "}");
		System.out.println("");
		
		/**
		 *  Operators and expression
		 */
		// Arithmetic operators (+, -, *, /, %)
		System.out.println("1 + 2 * 4 - 2 = " + (1 + 2 * 4 - 2));
		System.out.println("5 / 3 = " + (5 / 3));
		System.out.println("5.0 / 3.0 = " + (5.0 / 3.0));
		System.out.println("Math.round(5.0 / 3.0) = " + Math.round(5.0 / 3.0));
		System.out.println("Math.round(4.0 / 3.0) = " + Math.round(4.0 / 3.0));
		System.out.println("12 % 5 = " + (12 % 5));

		// Logical operators
		int n1 = 10;
		int n2 = 20;
		boolean isTrue = (n1 * 2 == n2);
		System.out.println("Is 2*10 same to 20? : " + isTrue);

		int n3 = 7;
		boolean isTrue1 = (n3 >= n1) && (n3 <= n2);
		boolean isTrue2 = (n3 < n1) || (n3 > n2);
		System.out.println("Is 7 between 10 and 20 inclusive? : " + (isTrue1 ? "Yes." : "No."));
		System.out.println("Is 7 less than 10 or greater tha 20? : " + (isTrue2 ? "Yes." : "No."));
		
		
		boolean bDone = false;
//		while (!bDone) {
//			int number = MyUtilities.inputInt(scanner, "Guess a number: ", 0, 100);
//			if (number == 0) {
//				break;
//			}
//			
//			System.out.println("Input number = " + number);	
//		}
		
		/*
		 *  Condition and flow controls
		 */
		
		// If, else if, else
		System.out.println("If, else if, else statements.");	
		bDone = false;
		while (bDone) {
			int n4 = MyUtilities.inputInt(scanner, "Enter a number (0 to exit): ", -100, 100);
			if (n4 < 0) {
				System.out.println("Entered number, " + n4 + ", is less than 0.");
			} else if (n4 == 0) {
				System.out.println("Entered number, " + n4 + ", is 0.");
			} else {
				System.out.println("Entered number, " + n4 + ", is greater than 0.");
			}
		}
		System.out.println("");	
	
		System.out.println("if (condition) ==> condition should be a boolean value.");	
		isTrue1 = (n1 + n2)*(n1 + n2) == (n1*n1 + 2*n1*n2 + n2*n2);
		isTrue2 = (n1*n1*n1 + n2*n2*n2) == (n1 + n2)*(n1*n1 - n1*n2 + n2*n2);
		if (isTrue1) {
			System.out.println("(x + y)^2 = x^2 + 2xy + y^2");
		}
		if (isTrue2) {
			System.out.println("x^3 + y^3 = (x + y)(x^2 - xy + y^2");
		}
		System.out.println("");	
	
		
		/*
		 *  Loops
		 */
		// for
		System.out.println("for : loop");	
		for (int i=0; i<idArray.length; i++) {
			System.out.println(idArray[i]);
		}
		System.out.println("");	
		
		// for :
		System.out.println("for : loop");	
		for (int id : idArray) {
			System.out.println(id);
		}
		System.out.println("");	
		
//		System.out.println("forEach");	
//		List<Integer> idList = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19);
//		idList.stream().forEach(id -> System.out.println(id));	
//		System.out.println("");	
				
		/*
		 *  Assignment
		 */
		
		/**
		 *  1. Swap two numbers
		 *  	- Request two integer numbers and hold the numbers in two int variables (numberA and numberB).
		 *  		. Use MyUtilities.inputInt() method to get the int value input.
		 *  	- Print those two numbers with lable
		 *  		ex) numberA = 20
		 *  			numberB = 35
		 *  	- [Swap the values of numberA and numberB]
		 *  	- Print numberA and numberB
		 *  	- [Assign the sum of two values to numberA and the product of two numbers to numberB]
		 *  	- Print numberA and numberB
		 */
		
		System.out.println("1. Swap two numbers");
		// Get two numbers
		int numberA = MyUtilities.inputInt(scanner, "Enter numberA: ", 0, 1000);
		int numberB = MyUtilities.inputInt(scanner, "Enter numberB: ", 0, 1000);
		System.out.println("numberA = " + numberA);
		System.out.println("numberB = " + numberB);
		System.out.println("");

		// Swap numberA and numberB
		System.out.println("Swap those two numbers.");
		int savedA = numberA;
		numberA = numberB;
		numberB = savedA;
		
		System.out.println("numberA = " + numberA);
		System.out.println("numberB = " + numberB);
		System.out.println("");
		
		// Set the sum of two numbers to numberA and
		// set the product of two numbers to numberB 
		System.out.println("Assign the sum and product to numberA and numberB.");
		savedA = numberA;
		numberA = numberA + numberB;
		numberB = savedA * numberB;
		
		System.out.println("Sum of numbers = " + numberA);
		System.out.println("Product of numbers = " + numberB);
		System.out.println("");
		
		
		scanner.close();
		
		System.out.println("Bye Java....");
	}
}
