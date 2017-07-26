/**
 * MyPatternSearch
 * 	
 * @author Kyeong Hwi Lee
 *
 */
public class MyPatternSearch {
	/**
	 * Basics:
	 * 		1. Add a private member holding the target text.
	 * 		2. Add a constructor (input: String theTargetText)
	 * 		3. Add search method
	 * 			input: 	[String] 	String to search.
	 * 			return: [int]		The index in the target text where the first matching happens.
	 * 								If there is no match, returns -1. 
	 */
    private String mText = "";

    MyPatternSearch (String strToTest) {
        mText = new String(strToTest);
    }
    
	/**
	 * TO DO:
	 * 		1. Add a new search method.
	 * 			input:	[String]	String to search.
	 * 					[int]		The index where the search begins.
	 * 			return: [int]		The index in the target text where the first matching happens.
	 * 								If there is no match, returns -1.
	 * 		2. Add a searchIgnoreCase method.
	 * 			Search specified string from the target text. (ignoring the case)
	 * 			input: 	[String] 	String to search.
	 * 			return: [int]		The index in the target text where the first matching happens.
	 * 								If there is no match, returns -1.
	 * 		3. 
	 */
	
       
    
    int search(String strToSearch) {
    	if (strToSearch.isEmpty()) {
    		return -1;
    	}
    	
    	int m = mText.length();
    	int n = strToSearch.length();

    	for(int i=0; i<m; i++) {
    		
    		int numberOfMatchedChars = 0;
    		for (int j=0; j<n; j++) {
    			if (mText.charAt(i+j) != strToSearch.charAt(j)) {
    				break;
    			}
    			numberOfMatchedChars++;
    		}

    		if (numberOfMatchedChars == n) {
    			return i;
    		}
    	}
    	
    	return -1;
    }

    public int search(String strToSearch, int startPosition) {

    	if (strToSearch.isEmpty()) {
            return -1;
        }
        
    	int m = mText.length();
    	int n = strToSearch.length();
    	
        int idxStartMatching = -1;
        for (int i=startPosition; i<m-n; i++) {
        	int matchedCount = 0;
            for (int j=0; j<n; j++) {
            	if (strToSearch.charAt(j) == mText.charAt(i+j)) {
            		matchedCount++;
            	}
            }
            if (matchedCount == n) {
            	idxStartMatching = i;
            	break;
            }
        }
        
        int idxStartMatching2 = mText.indexOf(strToSearch, startPosition);
        
        System.out.println("Search [" + strToSearch + "] = " + idxStartMatching + " (" + idxStartMatching2 + ")");
        
        return idxStartMatching;
    }
}
