# Leraning Java Programing

0. Preparations
    - Languages : C, C++, **Java**, Python, JavaScript, ObjectC, Swift,...
    - IDE (Integrated Development Environment)
    - [Download Java] (http://www.oracle.com/technetwork/java/javase/downloads/index.html)
        - JDK : Java SE Development Kit (Java SE 8)
    - [Download Eclipse IDE] (http://www.eclipse.org/downloads/eclipse-packages/)
    - Starts eclipse & makes a HelloJava project.
    
1. Basics
    - Referece :
        - [Oracle Java Language Basics](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/index.html)
        - [Java Tutorial](https://www.tutorialspoint.com/java/index.htm)
    - Structure & Naming: 
        - Case Sensitive
        - Class Name : Start with Upper Case
        - Variable & methods : Start with Lower Case
        - One main() method : `public static void main(String[] args)`
        - Same File and Class name. File extension is `.java`.
       
       
      ```
      public class HelloWorldApp {
          public static void main(String[] args) {
              System.out.println("Hello World!"); // Display the string.
          }
      }
      ```
        - statement ;
        ```
        int a = 10;
        a = a + 20;
        ```
        
        - block { statement; ... }
        ```
        public class MyClass {
        }
        
        if (condition) {
        }
        ```
    - Variables : Storage to hold specific type of value 
      Primitive Types & String
      ```
      boolean   trueOrFalse;    // true or flase
      char      letter;         // 16-bit Unicode character.
      byte      veryShortNumber;// 8-bit signed integer. [-128, 127]
      short     shorNumber;     // 16-bit signed integer. [-32,768, 32,767]
      int       number;         // 32-bit signed number. [-2^31, 2^31 - 1]
      long      longNumber;     // 64-bit signed number. [-2^63, 2^63 - 1]
      float     shortReal;      // 32-bit floating point. (Do not use it for precise calculation)
      double    real;           // 64-bit floating point.
      
      String    name = "KyeongHwi";
      ```
    - Array : Indexed storage holding a fixed number of same type variables (elements).
      ```
      int[] numberArray;    // Decleration
      
      numberArray = new int[10];    // Creates an array for 10 integers. Valid index range [0,9]
      numberArray[0] = 10;          // Assign 10 to the first element of the array.
      numberArray[9] = 5;           // Assign 5 to the last element of the array.
      System.out.println ("First Element Value = " + numberArray[0]);
      System.out.println ("First plus last Element Value = " + (numberArray[0] + numberArray[9]));
      
      ```
     - Practice
        - Ascii draw
        ```
        public class HelloWorld{
            static void draw (boolean[][] grid) {
                int nHeight = grid.length;
                int nWidth  = grid[0].length;
                char[] line = new char[2*nWidth];
                for(int y=0; y<nHeight; y++) {
                    for(int x=0; x<nWidth; x++) {
                        line[2*x] = grid[x][y] ? '@' : ' ';
                        line[2*x+1] = ' ';
                    }
                    System.out.println(line);
                }
            }
            public static void main(String []args){
                System.out.println("Hello World");

                boolean[][] drawingGrid = new boolean[32][32];

                for (int y=0; y<drawingGrid.length; y++) {
                    int xVal = (int)(Math.sqrt((double)y) + 0.5);
                    for (int x=0; x<drawingGrid[y].length; x++) {
                        drawingGrid[x][y] = (x*x == y);
                        drawingGrid[x][y] = (xVal == x);
                        drawingGrid[x][y] = ((x-16)*(x-16) + (y-16)*(y-16) <= 10*10);
                    }
                }
                draw(drawingGrid);
            }
        }
        ```

