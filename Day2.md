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
- Variable types (Later)
- Local variable
- Class variable
- Instance/Static variable

