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

- String patter search
```
public class HelloWorld
{
  public static void main(String[] args)
  {
	String testString = 
      "Pages you view in incognito tabs won’t stick around in your browser’s history, " + 
      "cookie store, or search history after you’ve closed all of your incognito tabs. " + 
      "Any files you download or bookmarks you create will be kept. However, you aren’t " + 
      "invisible. Going incognito doesn’t hide your browsing from your employer, " + 
      "your internet service provider, or the websites you visit.";
    
    MyPatternSearch myPatternSearch = new MyPatternSearch(testString);
    
    myPatternSearch.search("lee");
    myPatternSearch.search("to ta");
    myPatternSearch.search("web");
    myPatternSearch.search("in");
  }
}

public class MyPatternSearch {
  private String mString = "";
  MyPatternSearch (String strToTest) {
    mString = new String(strToTest);
  }
  
  int search(String strToSearch) {
    if (strToSearch.isEmpty()) {
      return -1;
    }
    
    int idxStartMatching = -1;
    int currentIdxToMatch = 0;
    for (int i=0; i<mString.length(); i++) {
      char chFromTargetString = mString.charAt(i);
      char chFromInputString  = strToSearch.charAt(currentIdxToMatch);
      if (chFromTargetString == chFromInputString) {
        if (idxStartMatching == -1) {
          idxStartMatching = i;
        }
        currentIdxToMatch++;
        if (currentIdxToMatch == strToSearch.length()) {
          break;
        }
      } else {
        currentIdxToMatch = 0;
        idxStartMatching = -1;
      }
    }
    
    int idxStartMatching2 = mString.indexOf(strToSearch);
    
    System.out.println("MySearch = " + idxStartMatching);
    System.out.println("String   = " + idxStartMatching2);
    
    return idxStartMatching;
  }
}
```
