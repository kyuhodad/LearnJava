import java.util.Scanner;


public class MyUtilities {

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
                } else if (inputNumber > maxValue) {
                    System.out.println("Input number should be less or equal to " + maxValue + ".");
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
                } else if (inputNumber > maxValue) {
                    System.out.println("Input number should be less or equal to " + maxValue + ".");
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

	static int nextInt(int minValue, int maxValue) {
		double t = Math.random();
		int value = (int)Math.round(((double)minValue) * (1.0 - t) + (double)maxValue * t);
		return value;
	}
	
}
