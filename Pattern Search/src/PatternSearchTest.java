
public class PatternSearchTest {

	public static void main(String[] args) {
		String basicTestString = "Wecome to Mississippi.";
        System.out.println("=====================================");
        System.out.println("Test String   : [" + basicTestString + "]");
        System.out.println("=====================================");

        MyPatternSearch myBasicPatternSearch = new MyPatternSearch(basicTestString);

        myBasicPatternSearch.search("is");
        myBasicPatternSearch.search("came");
        myBasicPatternSearch.search("ec");
        myBasicPatternSearch.search("ssi");
        myBasicPatternSearch.search("sip");
		
        String specialTestString = "aaabbaaba";
        MyPatternSearch mySpecailPatternSearch = new MyPatternSearch(specialTestString);
        
        String stringToSearch = "aab";

        System.out.println("=====================================");
        System.out.println("Test String   : [" + specialTestString + "]");
        System.out.println("=====================================");

      
        int position = -1;
        while ( (position = mySpecailPatternSearch.search(stringToSearch, position+1)) != -1 ) {
        	String strBeforeMatch = specialTestString.substring(0, position);
        	String strAfterMatch  = specialTestString.substring(position + stringToSearch.length());
        	System.out.println(strBeforeMatch + "/" + stringToSearch + "/" + strAfterMatch);
        }
		
        String testString = 
        "Pages you view in incognito tabs won¡¯t stick around in your browser¡¯s history, " + "\n" +
        "cookie store, or search history after you¡¯ve closed all of your incognito tabs. " + "\n" + 
        "Any files you download or bookmarks you create will be kept. However, you aren¡¯t " + "\n" +  
        "invisible. Going incognito doesn¡¯t hide your browsing from your employer, " + "\n" +  
        "your internet service provider, or the websites you visit.";
        
        System.out.println("=====================================");
        System.out.println("Test String   : [" + testString + "]");
        System.out.println("=====================================");

        MyPatternSearch myPatternSearch = new MyPatternSearch(testString);
        
        myPatternSearch.search("lee");
        myPatternSearch.search("to ta");
        myPatternSearch.search("web");
        myPatternSearch.search("in");
     
        stringToSearch = "in";
        position = -1;
        while ( (position = myPatternSearch.search(stringToSearch, position+1)) != -1 ) {
        	String strBeforeMatch = testString.substring(0, position);
        	String strAfterMatch  = testString.substring(position + stringToSearch.length());
        	System.out.println(strBeforeMatch + "/" + stringToSearch + "/" + strAfterMatch);
        }
	}

}
