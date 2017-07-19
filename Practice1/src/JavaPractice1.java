
/**
 * @author Kyeong Hwi Lee
 *
 */
public class JavaPractice1 {

	public static void main(String[] args) {
		/**
		 * 1. Make a size 20 number array with random values
		 * 	- Declare a number array (size 20) : (Hint: Use 'new' keyword to make a specified size array)
		 * 	- Set random numbers to the number array: (Note: Use MyUtilities.nextInt() method.)
		 *  - Print the array: It should be printed 5 numbers per line.
		 *    (ex) 1, 2, 3, 4, 5,
		 *         6, 7, 8, 9, 0,
		 *         6, 7, 8, 9, 0,
		 *         6, 7, 8, 9, 0
		 */
		int [] numberArray = new int[20];
		for (int i=0; i<numberArray.length; i++) {
			numberArray[i] = MyUtilities.nextInt(10, 100);
		}		
		printArray(numberArray, "Number Array", 5);
		
		/**
		 * 2. Find the greatest and smallest value in the array
		 * 	- Print the numbers and array indices of the numbers 
		 */
		int smallestNumberIdx = 0;
		int greatestNumberIdx = 0;
		for (int i=1; i<numberArray.length; i++) {
			if (numberArray[i] < numberArray[smallestNumberIdx]) {
				smallestNumberIdx = i;
			}
			if (numberArray[i] > numberArray[greatestNumberIdx]) {
				greatestNumberIdx = i;
			}
		}
		System.out.println("Smallest Number Index = " + 	smallestNumberIdx );
		System.out.println("Smallest Number       = " + 	numberArray[smallestNumberIdx] );
		System.out.println("Greatest Number Index = " + 	greatestNumberIdx );
		System.out.println("Greatest Number       = " + 	numberArray[greatestNumberIdx] );

		/**
		 * 3. Find the sum of numbers(number sum) and cubes of the numbers(cube sum)
		 * 	- Print the results
		 */
		long sum = 0;
		long sumOfQubes = 0;
		for (int i=0; i<numberArray.length; i++) {
			sum += numberArray[i];
			sumOfQubes += numberArray[i]*numberArray[i]*numberArray[i];
		}
		System.out.println("Sum           = " + sum);
		System.out.println("Sum of Cubes  = " + sumOfQubes);


		/**
		 * 4. Reverse the array
		 * 	- Make the array in reversed order.
		 *    (ex) { 1, 2, 3, 4, 5 } --> { 5, 4, 3, 2, 1 }
		 *  - Print the reversed array 
		 */
		for (int i=0; i<numberArray.length/2; i++) {
			int saved = numberArray[i];
			numberArray[i] = numberArray[numberArray.length - i - 1];
			numberArray[numberArray.length - i - 1] = saved;
		}
		printArray(numberArray, "Number Array", 5);
		
		/**
		 * 5. Make another array and store the remainders (divided by 5) of the original array numbers.
		 *	- Print the new array. 
		 * 	  (ex) { 12, 34, 57, 73, 28 } --> { 2, 4, 2, 3, 3 }
		 */
		int [] mod5NumberArray = new int[numberArray.length];
		for (int i=0; i<numberArray.length; i++) {
			mod5NumberArray[i] = numberArray[i] % 5;
		}
		printArray(mod5NumberArray, "Mod5 Number Array", 5);
		
		/**
		 * 6. Shift (circular way) the element location by 5 and print it.
		 * 	  (ex)  { 1, 2, 3, 4, 5, 6, 7, 8 } --> { 4, 5, 6, 7, 8, 1, 2, 3 }
		 */
		int [] shiftedNumberArray = new int[numberArray.length];
		for (int i = 0; i<numberArray.length; i++) {
			shiftedNumberArray[(i+5)%numberArray.length] = numberArray[i];
		}
		printArray(shiftedNumberArray, "Shifted Number Array", 5);
		
	}

	private static void printArray(int[] numberArray, String title, int numberOfItemPerLine) {
		System.out.println(title + " = {");
		String lineString = "";
		for (int i=0; i<numberArray.length; i++) {
			if ( i % numberOfItemPerLine == 0) {
				lineString = "    ";
			}
			
			lineString += Integer.toString(numberArray[i]);
			
			if ( i < (numberArray.length - 1)) {
				lineString += ", ";
			}
			
			if ( (i + 1)% numberOfItemPerLine == 0) {
				System.out.println(lineString);
			}
		}
		System.out.println("}");
	}
	
}
