class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        

		for (int i = 0; i < numLog.length(); i++) {
			char c = numLog.charAt(i);
			if (c == 'w') {
				answer += 1;
			} else if (c == 's') {
				answer -= 1;
			} else if (c == 'd') {
				answer += 10;
			} else if (c == 'a') {
				answer -= 10;
			}
		}
        return answer;
    }
}