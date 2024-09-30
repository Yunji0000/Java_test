class Solution {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        
        for(int i =0; i<number.length(); i++) {
            char one = number.charAt(i);
            
            int num = Character.getNumericValue(one);  // char를 int로 변환하기
                sum += num;
            answer = sum % 9;
        }
        return answer;
    }
}