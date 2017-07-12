import java.util.Scanner;


public class MyUtilities {

	/**
	 * Get integer input.
	 * @param scanner: scanner object
	 * @param message: Prompt message
	 * @param minValue: Smallest value allowed. (inclusive)
	 * @param maxValue: Greatest value allowed. (exclusive)
	 * @return Input value
	 */
    static int inputInt (Scanner scanner, String message, int minValue, int maxValue) {
    	int inputNumber = 0;
        
        boolean bDone = false;
        while (!bDone) {
            if (message != null) {
                System.out.println(message);
            }
            
            try {
                inputNumber = scanner.nextInt();
                if (inputNumber < minValue) {
                    System.out.println("Input number should be greater or equal to " + minValue + ".");
                } else if (inputNumber >= maxValue) {
                    System.out.println("Input number should be less than " + maxValue + ".");
                } else {
                    bDone = true;
                }
            } catch (Exception ex) {
                System.out.println("Invalid input!");
            }
            
            // Consume carriage return.
            scanner.nextLine();
        }              
        return inputNumber;
    }

	/**
	 * Get integer input.
	 * @param scanner: scanner object
	 * @param message: Prompt message
	 * @param minValue: Smallest value allowed. (inclusive)
	 * @param maxValue: Greatest value allowed. (exclusive)
	 * @return Input value
	 */
    static double inputDouble (Scanner scanner, String message, double minValue, double maxValue) {
    	double inputNumber = 0;
        
        boolean bDone = false;
        while (!bDone) {
            if (message != null) {
                System.out.println(message);
            }
            
            try {
                inputNumber = scanner.nextDouble();
                if (inputNumber < minValue) {
                    System.out.println("Input number should be greater or equal to " + minValue + ".");
                } else if (inputNumber >= maxValue) {
                    System.out.println("Input number should be less than " + maxValue + ".");
                } else {
                    bDone = true;
                }
            } catch (Exception ex) {
                System.out.println("Invalid input!");
            }
            
            // Consume carriage return.
            scanner.nextLine();
        }              
        return inputNumber;
    }

    /**
     * Return a random value [minValue, maxValue).
     * @param minValue: Smallest value (inclusive)
     * @param maxValue: Greatest value (exclusive)
     * @return
     */
	static int nextInt(int minValue, int maxValue) {
		double t = Math.random();
		int value = (int)Math.round(((double)minValue) * (1.0 - t) + (double)maxValue * t);
		return value;
	}
	
}
