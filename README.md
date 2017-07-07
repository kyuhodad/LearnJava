# Leraning Java Programing

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
    - Class : Template to define an object
      ```
      class QuadraticFunction {
        public double a;
        public double b;
        public double c;
        public QuadraticFunction () {
          a = 0.0;
          b = 0.0;
          c = 0.0;
        }
        public QuadraticFunction (double a, double b, double c) {
          this.a = a;
          this.b = b;
          this.c = c;
        }
        public double evaluate(double x) {
          return a*x*x + b*x + c; 
        }
      }

      public class MyApp {
        public static void main(String[] args) {
          QuadraticFunction quadFunc1 = new QuadraticFunction();
          System.out.println("quadFunc1(1.0) = " + quadFunc1.evaluate(1.0)); // 0.0
          quadFunc1.a = 10.0;
          System.out.println("quadFunc1(1.0) = " + quadFunc1.evaluate(1.0)); // 10.0

          QuadraticFunction quadFunc2 = new QuadraticFunction(1.0, 2.0, 3.0);
          System.out.println("quadFunc2(2.0) = " + quadFunc2.evaluate(2.0)); // 11.0           
        }
      }
      
      ```        
     - Variable types (Later)
        - Local variable
        - Class variable
        - Instance/Static variable
     - Homework1
        - 
