/**
 * @author Kyeong Hwi Lee
 *
 */
public class QuadraticEquationApp {

	public static void main(String[] args) {
		/**
		 * Create QuadFunction objects with following data
		 * 	quadFunc1 : { 1.0, 2.0, 1.0 }
		 * 	quadFunc2 : { 1.0, 4.0, 2.0 }
		 * 	quadFunc3 : { 1.0, 2.0, 2.0 }
		 * 	quadFunc4 : { 0.0, 2.0, 1.0 }
		 * 	quadFunc5 : { 0.0, 0.0, 1.0 }
		 * 
		 */	
		QuadraticFunction quadFunc1 = new QuadraticFunction(1.0, 2.0, 1.0);
		QuadraticFunction quadFunc2 = new QuadraticFunction(1.0, 4.0, 2.0);
		QuadraticFunction quadFunc3 = new QuadraticFunction(1.0, 2.0, 2.0);
		QuadraticFunction quadFunc4 = new QuadraticFunction(0.0, 2.0, 1.0);
		QuadraticFunction quadFunc5 = new QuadraticFunction(0.0, 0.0, 1.0);
		
		/**
		 * Print the functions using toString method.
		 */
		System.out.println("Function1 : " + quadFunc1.toString());
		/**
		 * TO DO : Print the rest of the functions, here. 
		 */
		
		
		/**
		 * Solve the equations defined by the functions.
		 */
		QuadraticFunction [] quadFuncArray = { 
				quadFunc1,
				quadFunc2, 
				quadFunc3, 
				quadFunc4, 
				quadFunc5 
		};
		
		System.out.println("");
		for (int i=0; i<quadFuncArray.length; i++) {
			double [] x = quadFuncArray[i].solve();
			
			/**
			 * TO DO: Print out the solutions with following format.
			 * 		If 2 solutions (x.length == 2) which are 1 and 2: 
			 * 			x[0] = 1
			 * 			x[1] = 2
			 * 		If 1 solution (x.length == 2) which is 5:
			 * 			x = 5
			 * 		If no solution (x == null) :
			 * 			There is no real solution.
			 */
			System.out.println(quadFuncArray[i].toString() + " = 0");
			if (x == null || x.length == 0) {
				System.out.println("There is no real solution.");
			} else if (x.length == 1) {
				System.out.println("x = " + x[0]);
			} else {
				System.out.println("x[0] = " + x[0]);
				System.out.println("x[1] = " + x[1]);
			}
			System.out.println("");
		}
	}
}
