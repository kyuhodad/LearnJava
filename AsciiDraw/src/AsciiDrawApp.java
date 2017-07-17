/**
 * 
 */

/**
 * @author Kyeong Hwi Lee
 *
 */
public class AsciiDrawApp {
	
    public static void main(String []args){
        System.out.println("Hello World");

        /**
         *  Create a two-dimensional array of boolean
         */
        // final int drawingGridSize = 32;
        boolean[][] drawingGrid = new boolean[32][32];
        
        /**
         * Fill up the array & draw it.
         */
        for (int y=0; y<drawingGrid.length; y++) {
            for (int x=0; x<drawingGrid[y].length; x++) {
                drawingGrid[y][x] = (y <= x);
            }
        }
        
        draw(drawingGrid);
        
        //draw2(drawingGrid);
    }

    static void draw (boolean[][] grid) {
        int nHeight = grid.length;
        int nWidth  = grid[0].length;
        char[] line = new char[2*nWidth];
        for(int y=0; y<nHeight; y++) {
            for(int x=0; x<nWidth; x++) {
                line[2*x] = grid[y][x] ? '@' : ' ';
                line[2*x+1] = ' ';
            }
            System.out.println(line);
        }
    }
    
    static void draw2 (boolean[][] grid) {
        int nHeight = grid.length;
        int nWidth  = grid[0].length;
        boolean [][] gridForDraw = new boolean [nHeight][nWidth];
        for (int y=0; y<nHeight; y++) {
        	int newY = nHeight - y - 1;
            for (int x=0; x<nWidth; x++) {
            	gridForDraw[newY][x] = grid[y][x];
            }        	
        }
        
        draw(gridForDraw);    	
    }
}
