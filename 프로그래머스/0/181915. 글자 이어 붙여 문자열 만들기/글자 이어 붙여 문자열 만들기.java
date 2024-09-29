class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        
        
        //인덱스 번호를 출력
        for(int i =0; i<my_string.length(); i++) {
            char one = my_string.CharAt(index_list[i]);
            answer += one;
        }
        return answer;
    }
}