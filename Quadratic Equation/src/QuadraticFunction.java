/**
 * @author Kyeong Hwi Lee
 *
 */

public class QuadraticFunction {
	/**
	 * f(x) = mA*x^2 + mB*x  mC;
	 */
	double mA = 0.0, mB = 0.0, mC = 0.0;

	/**
	 * Constructor..
	 * f(x) = a*x^2 + b*x + c
	 */
	public QuadraticFunction(double a, double b, double c) {
		mA = a;
		mB = b;
		mC = c;
	}
	

	/**
	 * Evaluate() method.
	 * 	Input: x (double) value to evaluate
	 *  Return:  Evaluated value
	 */
	public double evaluate (double x) {
		return 	mA*x*x +
				mB*x +
				mC;
	}
	
	/**
	 * TO DO : Implement solve() method.
	 * 	solve :
	 * 		Returns the solutions for f(x) = 0.
	 * 			- If there is no solution, return null.
	 * 			- If there is one solution, return size 1 double array.
	 * 			- If there are two solutions, return size 2 double array.
	 * HINT: As you know, the solutions for ax^2 + bx + c = 0 are
	 * 		 x[0] = ( -b + Math.sqrt(b^2 -4ac) ) / 2a
	 * 		 x[1] = ( -b - Math.sqrt(b^2 -4ac) ) / 2a
	 * 	Also, you may know that
	 * 		b^2 -4ac is less than 0 	=> No solution
	 * 					zero        	=> One solution
	 *  				greater than 0	=> Two solutions
	 *  
	 *  One more thing... you need to consider the case that a is zero.
	 */
	double[] solve () {
		/**
		 * TO DO : Add your codes, here.
		 */
		
		// You need to replace following lines with your codes.
		double [] solutions = null; // null means nothing. Return it if no solution.
		return solutions; 
	}
	
	
	/**
	 * Add toString() method (by "RightClick/Source/Generate toString")
	 * 	- All Java class has toString() method.
	 *  - Here, you can override the method as what you want.
	 */
	@Override
	public String toString() {
		String strA = "";
		if (mA != 1) strA += mA;

		String strB = "";
		if (mB != 1) strB += mB;
	
		return "f(x) = " + strA + "x^2 + " + strB + "x + " + mC;
	}
}
