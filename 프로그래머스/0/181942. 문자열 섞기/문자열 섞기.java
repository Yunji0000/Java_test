class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        int str1Idx = 0;
        int str2Idx = 0;

        for(int i = 1; i <= str1.length()*2; i++){
            if(i % 2 ==1){
                answer += str1.charAt(str1Idx);
                str1Idx++;
            }
            else {
                answer += str2.charAt(str2Idx);
                str2Idx++;
            }
        }
        return answer;
    }
}