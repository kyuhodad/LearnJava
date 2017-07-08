import java.util.Scanner;

public class HelloJava {
	public static void main(String[] args) {
		/**
		 * Print 'Hello Java!!!'
		 */
		System.out.println("Hello Java!!!");
		
		/**
		 * Primitive type variables  
		 */
		System.out.println("[Integer type]");
		int number1 = 14;
		int number2 = number1 + 36;
		System.out.println("number1 = " + number1);
		System.out.println("number2 = " + number2);
		System.out.println("number1^2 - number2^2 = " + (number1*number1 - number2*number2));
		System.out.println("(number1 + number2)*(number1 - number2) = " + ((number1 + number2)*(number1 - number2)));
		System.out.println("");

		System.out.println("[Integer max and min values & over/underflow]");
		int maxNumber = Integer.MAX_VALUE;
		int minNumber = Integer.MIN_VALUE;
		System.out.println("maxNumber = " + maxNumber + ";  minNumber = " + minNumber);
		System.out.println("maxNumber + 1 = " + (maxNumber + 1));
		System.out.println("minNumber - 1 = " + (minNumber - 1));
		System.out.println("");

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

		System.out.println("[Char type & how to assign unicode]");
		char letter1 = 'Q';
		char letter2 = 'R';
		System.out.println("letter1, letter2 = " + letter1 + "," + letter2);
		letter1 = '\u0041';
		letter2 = '\u03b2';
		System.out.println("letter1, letter2 = " + letter1 + "," + letter2);
		System.out.println("");

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
		
		System.out.println("[Print array (4 elements in a line]");
		String lines = "";
		for (int i=0; i<idArray.length; i++) {
			if (i % 4 == 0) {
				lines += "\t";
			}

			lines += i;
			
			if ( i != (idArray.length - 1)) {
				lines += ", ";
				if ( (i+1) % 4 == 0 ) {
					lines += "\n";
				}
			}
		}
		System.out.println("idArray = {");
		System.out.println(lines + "}");
		System.out.println("");
		
		/**
		 *  Operators and expression
		 */
        Scanner scanner = new Scanner(System.in);
		
		boolean bDone = false;
		while (!bDone) {
			int number = MyUtilities.inputInt(scanner, "Guess a number: ", 0, 100);
			if (number == 0) {
				break;
			}
			
			System.out.println("Input number = " + number);	
		}
		
		/*
		 *  Condition and flow controls
		 */
		
		
		/*
		 *  Loops
		 */
		
				
		/*
		 *  Assignment
		 */
	
		scanner.close();
		
		System.out.println("Bye Java....");
	}
}
