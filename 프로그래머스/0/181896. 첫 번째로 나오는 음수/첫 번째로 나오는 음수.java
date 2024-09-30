class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int[] arr;
        arr = new int[num_list.length];
        
        for(int i=0; i<num_list.length; i++){
           // answer = arr[i];
            if(num_list[i] < 0){
                return i;
            }
        }  return -1;
    }
}