class Solution {
    public int solution(int[] num_list) {
        int odd_sum = 0;
        int even_sum = 0;

        
        int[] odd_arr;
        odd_arr = new int[num_list.length];  // 홀수 배열
        int[] even_arr;
        even_arr = new int[num_list.length]; // 짝수 배열
        
        int odd_ind = 0;  // 홀수 인덱스
        int even_ind = 0; // 짝수 인덱스

        for (int i=0; i<num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                even_arr[even_ind] = num_list[i]; //짝수 저장
                even_ind++;
            } else {
                odd_arr[odd_ind] = num_list[i]; //홀수 저장
                odd_ind++;
            }
        }

        for (int i=0; i < odd_ind; i++) {
            odd_sum = odd_sum * 10 + odd_arr[i]; // 홀수 이어붙이기
        }

        for (int i = 0; i < even_ind; i++) {
            even_sum = even_sum * 10 + even_arr[i]; // 짝수 이어붙이기
        }

        // 홀수와 짝수의 합 반환
        return odd_sum + even_sum;
    }
}