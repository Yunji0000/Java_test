class Solution {
    public int[] solution(int[] num_list) {
        //int[] answer = {};
        int[] answer;
        answer = new int[num_list.length + 1];
        
        int last = num_list[num_list.length - 1]; //마지막 원소
        int last_1 =  num_list[num_list.length - 2]; //그 전 원소 
        
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        
        if(last > last_1) {
             answer[num_list.length] = last - last_1;
        }
        else{
             answer[num_list.length] = last * 2;
        }
        return answer;
        
    }
}