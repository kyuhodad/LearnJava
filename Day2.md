# Leraning Java Programing

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
- Local variable : Defined in a method block and valid in the block.
    ```
    public class MyApp {
        public static void main(String[] args) {
            String message = "How old are you?"; // Local variable
            
            int n = 10, m = 20;
            if (n < m) {
                String messageInIfBlock = "n is less tha m."; // Local variable in this if block.
            }
            // CANNOT use messageInIfBlock variable, here.
            
            for (int i=0; i<5; i++) { // i is a local variable valid in for-loop.
                int jInForBlock = 100;
            }
            // CANNOT use i and jInForBlock variable, here.           
        }
    }
    ```
- Class variable/method : Defined in a class with static modifier. Accessed by ClassName.variableName.
- Instance variable : Defined in an object created (by new) based on a class.
    ```
    class Student {
        // Instance Variable
        String firstName; 
        String lastName;
        
        // Constructor
        Student (String fName, String lName) {
            firstName = fName;
            lastName = lName;
        }
        // Instance method
        String getFullName () {
            return firstName + " " + lastName;
        }
        
        // Class variables/methods
        static String classVariable = "Class Variable";
        static String classMethod () {
            return "Class Method";
        }
    }
    
    public class MyApp {
        public static void main(String[] args) {
            System.out.println(Student.classVariable);
            System.out.println(Student.classMethod());
            
            // Following lines are invalid, since an object is not created
            //System.out.println(Student.firstName);
            //System.out.println(Student.lastName);
            //System.out.println(Student.getFullName());
            
            // Instantiate an object using a class
            Student student1 = new Student ("Rod", "Tavanga");
            Student student2 = new Student ("Kyuho", "Lee");
            System.out.println(student1.firstName);
            System.out.println(student1.lastName);
            System.out.println(student1.getFullName());
            System.out.println(student2.firstName);
            System.out.println(student2.lastName);
            System.out.println(student2.getFullName());
        }    
    }
    
    ```

