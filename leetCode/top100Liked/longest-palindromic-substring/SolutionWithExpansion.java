/*
    Simple approach. 
    Expand base pallindromes ( 1 char / 2 chars that are repeating )

    issue: have to handle even sized pallindromes. ex "cbba"
 */
class SolutionWithExpansion {
    public String longestPalindrome(String s) {
        
        if(s.length() < 2) {
            return s;
        }
        
        String longestPalindrome = s.substring(0,1);
        
        for(int i = 0; i < s.length() - 1; i++) {
            
            String resultFor1 = expandPalindrome(i, i, s); 
            String resultFor2 = expandPalindrome(i, i+1, s);
            
            if(longestPalindrome.length() < resultFor1.length()) {
                longestPalindrome = resultFor1;
            }
            if(longestPalindrome.length() < resultFor2.length()) {
                longestPalindrome = resultFor2;
            }
        }
        
        return longestPalindrome;
    }
    
    private String expandPalindrome(int start, int end, String s) {
        if(start != end && (s.charAt(start) != s.charAt(end))) {
            return "";
        }
        int size = 1;
        while((start - size >= 0) && (end + size < s.length()) && (s.charAt(start - size) == s.charAt(end + size))) {
            size = size + 1;
        }
        size = size - 1;
        return s.substring(start - size, end + size + 1);
    }
}