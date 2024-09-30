class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if (n % 2 == 1) { // 홀수인 경우
            for (int i = 1; i <= n; i++) { 
                if (i % 2 == 1) { // 홀수인 경우
                    answer += i;
                }
            }
        } else { // n이 짝수인 경우
            for (int i = 1; i <= n; i++) { 
                if (i % 2 == 0) { // 짝수인 경우
                    answer += (i * i);
                }
            }
        }
        
        return answer;
    }
}