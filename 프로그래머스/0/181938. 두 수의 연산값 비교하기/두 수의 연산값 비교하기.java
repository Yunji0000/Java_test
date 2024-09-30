class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        // int를 문자열로
        // String result = String.valuOf(int변수);
        // 문자열을 int로
        // int result2 = Integer.parseInt(String변수);
        String result_a = String.valueOf(a);
        String result_b = String.valueOf(b);
        String sum = result_a + result_b;
        int sum_ch =Integer.parseInt(sum);
        
        if(sum_ch > (2*a*b)){
            answer = sum_ch;
        }
        else if(sum_ch < (2*a*b)){
            answer = 2*a*b;
        }
        else{
            answer = sum_ch;
        }
        return answer;
    }
}