class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int odd =0;
        int even = 0;
        
        for(int i=0; i<num_list.length; i++){
            if(i % 2 == 0) //짝수번째 인덱스 
            { 
                odd += num_list[i];
            }
            else{
                even += num_list[i];
            }
        }
        if(odd > even){
            answer = odd;
        }
        else if(odd < even) {
            answer = even;
        }
        else{
            answer = odd;
        }
        
        return answer;
    }
}