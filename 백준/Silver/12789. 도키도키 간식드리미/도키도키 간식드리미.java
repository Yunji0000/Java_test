import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int turn = 1;
        for (int i = 0; i < N; i++) {
            int student = Integer.parseInt(st.nextToken());

            if (student == turn) {
                turn++;

            while (!stack.isEmpty() && stack.peek() == turn) {
                stack.pop();

                turn++;
            }
         }
            else{
                stack.push(student);
            }
        }
        if (!stack.isEmpty()) {
            bw.write("Sad");

        } else {
            bw.write("Nice");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    }
