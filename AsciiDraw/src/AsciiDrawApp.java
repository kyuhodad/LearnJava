/**
 * 
 */

/**
 * @author Kyeong Hwi Lee
 *
 */
public class AsciiDrawApp {
	
    public static void main(String []args){
        /**
         *  Create a two-dimensional array of boolean
         */
        // final int drawingGridSize = 32;
        boolean[][] drawingGrid = new boolean[32][32];
        
        /**
         * Fill up the array & draw it.
         *  (1) y <= x    
         *  (2) Math.abs(x) + Math.abs(y-16) <= 10 
        **/
        
        /**
         *  
         * To Do:
         *  (1) Draw a filled square (size 12 x 12) at center
         *  (2) Fill the inside of diamond (shown in the code) and outside of the square (1)
         *  (3) Draw every other horizontal line.
         *  (4) Draw every other horizontal line, but do not draw inside of the diamond.
		 *
         * NOTE: You may need to following operators
         * 	Comparisons: ==, !=, <, <=, >, >=
         * 		(10 == 20) : Equal 		(false)
         * 		(10 != 20) : Not equal 	(true)
         * 		(10 <  20) : Less than	(true)
         * 		(10 >= 10) : Greater than or equal (true)
         *   
         *  Logical operation: && (AND), || (OR), ! (NOT)
         * 		a && b  : TRUE if a and b both are true. Otherwise FALSE.
         * 		a || b  : TRUE if a or b is true. Otherwise, FALSE.
         * 		!a      : TRUE if a is false. Otherwise, FALSE.
         * 				 (10 == 10) && (20 < 21) ==> true
         * 				 (10 == 10) && (20 > 21) ==> false
         * 				 (10 == 10) || (20 > 21) ==> true
         * 				 (10 != 10) || (20 > 21) ==> false
         * 				 !(20 > 21)				 ==> true
         * 
         */
        for (int y=0; y<drawingGrid.length; y++) {
            for (int x=0; x<drawingGrid[y].length; x++) {
            	// (1) y <= x
            	// drawingGrid[y][x] = (y <= x);
            	
            	// (2) Diamond: |x-16| + |y-16| <= 10
                drawingGrid[y][x] = (Math.abs(x-16) + Math.abs(y-16) <= 10);
                
                // TODO - (1) Draw a filled square (size 12 x 12) at center
                
				// TODO - (2) Fill the inside of diamond (shown in the code) and outside of the square (1)
                
				// TODO - (3) Draw every other horizontal line.
                
				// TODO - (4) Draw every other horizontal line, but do not draw inside of the diamond.
           }
        }
        
        draw(drawingGrid);
    }

    static void draw (boolean[][] grid) {
        int nHeight = grid.length;
        int nWidth  = grid[0].length;
        char[] line = new char[2*nWidth];
        for(int y=0; y<nHeight; y++) {
            for(int x=0; x<nWidth; x++) {
                line[2*x] = grid[y][x] ? '@' : ' '; // condition ? A : B
                line[2*x+1] = ' ';
            }
            System.out.println(line);
        }
    }
}
