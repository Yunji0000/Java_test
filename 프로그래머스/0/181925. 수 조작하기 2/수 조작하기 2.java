public class Solution {
    public String solution(int[] numLog) {
        String answer = ""; 

        for (int i = 1; i < numLog.length; i++) {
            int c = numLog[i] - numLog[i - 1]; //이전-현재 비교
            
            if (c == 1) {
                answer += "w"; 
            } else if (c == -1) {
                answer += "s"; 
            } else if (c == 10) {
                answer += "d"; 
            } else if (c == -10) {
                answer += "a"; 
            }
        }

        return answer; 
    }
}
