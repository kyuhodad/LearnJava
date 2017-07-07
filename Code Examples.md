- Input number
```
class MyInput {
    static int inputIntNumber (String message, int minValue, int maxValue) {
        
        Scanner in = new Scanner(System.in);
        
        int inputNumber = 0;
        
        boolean bDone = false;
        while (!bDone) {
            if (message != null) {
                System.out.println(message);
            }
            
            try {
                inputNumber = in.nextInt();
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
            
            // Consume carage return.
            in.nextLine();
        }
        
        in.close();
        
        return inputNumber;
    }
}

public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        
        int num = MyInput.inputIntNumber ("Type a number between 0 and 100:", 0, 100);
        System.out.println("Input number is " + num + "!!!");
        
        System.out.println("Bye World");
        
     }
}
```
