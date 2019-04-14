/*
    O(n)
    https://leetcode.com/problems/zigzag-conversion/
*/

class Solution {
    
    public String convert(String s, int numRows) {
        
        char[] output = new char[s.length()];
        int currentIndex = 0;
        
        if(numRows == 1) {
            return s;
        }
        
        for(int i = 0 ; i < numRows; i++ ) {
            
            if(i == 0 || i == (numRows - 1)) {
                int j = i; 
                while(j < s.length()) {
                    output[currentIndex++] = s.charAt(j);
                    j  = j + ((numRows - 1) * 2);                
                }
            } else {
   
                int j = i;

                while(j < s.length()) {

                    output[currentIndex++] = s.charAt(j);
                    j  = j + ((numRows - 1) * 2) - (i * 2);  
                    if(j < s.length()){
                        output[currentIndex++] = s.charAt(j);
                        j  = j + (i * 2);
                    }
                }
                
            }            
        }
        
        return new String(output);        
    }
} 