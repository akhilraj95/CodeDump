/*
    Recursize Solution with Memoization. But got time limit exceeded.

    Complexity: 
    isPallindrome = n/2
    longestPallindrome = n*n times recursed. 

    total = n/2 * n^2 => n^3

    Bad solution
*/
class SolutionWithRecursion {
    
    Map<String, String> memoizedResults = new HashMap<>();
    
    public String longestPalindrome(String s) {

        if(memoizedResults.containsKey(s)) {
            return memoizedResults.get(s);
        }
        
        if(isPallindrome(s)) {
            memoizedResults.put(s, s);
            return s;
        }
        else {
            String longestString = "";
            
            for(int i = 0 ; i < s.length(); i++) {
                for(int j = i+1; j<= s.length(); j++) {
                    if(j-i != s.length()) {
                        String subString = s.substring(i,j);
                        String result = longestPalindrome(subString);
                        memoizedResults.put(subString, result);
                        if(result.length() > longestString.length()) {
                            longestString = result;
                        }                        
                    }
                }
            }
            return longestString;
        }
    }
    
    private boolean isPallindrome(String string) {
        if(string.length() <= 1) {
            return true;
        }
        else {
            int max = string.length() - 1;
            int min = 0;
            while(max > min) {
                if(string.charAt(min) != string.charAt(max)) {
                    return false;
                }
                min = min + 1;
                max = max - 1;
            }
            return true;
        }
    }
}