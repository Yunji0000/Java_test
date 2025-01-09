import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String a = br.readLine();
            if (a.equals(".")) {
                break;
            }

            Stack<Character> stack = new Stack<>();
            String result = "yes";

            for (int i = 0; i < a.length(); i++) {
                char c = a.charAt(i);

                if (c == '(' || c == '[') {
                    stack.push(c);
                }
                else if (c == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        result = "no";
                        break;
                    }
                    stack.pop();
                }
                else if (c == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        result = "no";
                        break;
                    }
                    stack.pop();
                }
            }

            if (!stack.isEmpty()) {
                result = "no";
            }

            bw.write(result + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
