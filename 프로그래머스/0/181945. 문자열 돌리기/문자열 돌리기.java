import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();

		for (int i = 0; i < a.length(); i ++){
			char c = a.charAt(i);
			System.out.println(c);
		}
	}
}
/**

 *
 * String index out of range: 5
 *
 *
 *
 * a = "test";
 * a.length() == 3;
 * a.charAt(0);
 * 0 a.length()
 * 3 < 2
 *
 * a
 * s
 * d
 */