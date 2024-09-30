class Solution {
    public int[] solution(int n) {
        
        int[] answer;
        answer = new int[1000];
        int index = 0;

        while (n != 1) {
            answer[index++] = n; 
            if (n % 2 == 0) {
                n = n / 2; 
            } else {
                n = 3 * n + 1; 
            }
        }
        
        answer[index++] = 1; 

        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = answer[i]; 
        }
        
        return result; 
    }
}
