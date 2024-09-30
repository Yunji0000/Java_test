class Solution {
    public int solution(int a, int b, int c) {
        //int answer = 0;
        int sum = a + b +c;
        
         if (a != b && b != c && a != c) {
            // 모든 숫자가 다를 때
            return sum;
             
        } else if ((a == b && b != c) || (a == c && a != b) || (b == c && a != b)) {
            // 두 숫자가 같고 나머지 하나가 다를 때
           
             return sum * (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        } else if (a == b && b == c) {
            // 모든 숫자가 같을 때
            return sum * ((int)Math.pow(a, 2) + (int)Math.pow(b, 2) + (int)Math.pow(c, 2)) * ((int)Math.pow(a, 3) + (int)Math.pow(b, 3) + (int)Math.pow(c, 3));
        }
        
      return sum;
        //return 0;
    }
}
