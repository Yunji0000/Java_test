class Solution {
    public int solution(int a, int b) {
       int answer = 0;

		String strA = String.valueOf(a);
		String strB = String.valueOf(b);

		// 2개의 값
		String c1 = strA + strB;
		String c2 = strB + strA;

		int intC1 = Integer.parseInt(c1);
		int intC2 = Integer.parseInt(c2);

		if (intC1 > intC2) {
			answer = intC1;
		} else if (intC1 < intC2) {
			answer = intC2;
		} else {
			answer = intC1;
		}
return answer;
    }
}