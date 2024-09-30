class Solution {
    public String solution(String my_string, String alp) {
        String answer = ""; 
        
        for (int i = 0; i < my_string.length(); i++) {
            char one = my_string.charAt(i); 
            
            if (one == alp.charAt(0)) { 
                answer += Character.toUpperCase(one); 
            } else {
                answer += one; 
            }
        }
        
        return answer; 
    }
}
