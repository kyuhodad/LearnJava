
public class MyPatternSearch {
    private String mText = "";
       
    MyPatternSearch (String strToTest) {
        mText = new String(strToTest);
    }
    
    int search(String strToSearch) {

    	if (strToSearch.isEmpty()) {
            return -1;
        }
        
    	int m = mText.length();
    	int n = strToSearch.length();
    	
        int idxStartMatching = -1;
        for (int i=0; i<m-n; i++) {
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
        
        int idxStartMatching2 = mText.indexOf(strToSearch);
        
        System.out.println("Search [" + strToSearch + "] = " + idxStartMatching + " (" + idxStartMatching2 + ")");
        
        return idxStartMatching;
    }

    int search(String strToSearch, int startPosition) {

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
