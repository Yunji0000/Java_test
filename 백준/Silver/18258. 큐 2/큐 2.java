import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> que = new LinkedList<>();

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String input = st.nextToken();

            if (Objects.equals(input, "push")) {
                int X = Integer.parseInt(st.nextToken());
                que.add(X);
            }
            else if (Objects.equals(input, "pop")) {
                if (!que.isEmpty()) {
                    bw.write(que.poll() + "\n");
                } else {
                    bw.write("-1\n");
                }
            }
            else if (Objects.equals(input, "size")) {
                bw.write(que.size() + "\n");
            }
            else if (Objects.equals(input, "empty")) {
                if (que.isEmpty()) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            }
            else if (Objects.equals(input, "front")) {
                if (!que.isEmpty()) {
                    bw.write(que.peek() + "\n");
                } else {
                    bw.write("-1\n");
                }
            }
            else if (Objects.equals(input, "back")) {
                if (!que.isEmpty()) {
                    bw.write(que.getLast() + "\n");
                } else {
                    bw.write("-1\n");
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
