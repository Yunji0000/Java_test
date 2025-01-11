import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int N=Integer.parseInt(br.readLine());
        Deque<Integer> deque=new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int X = Integer.parseInt(st.nextToken());

            if (X== 1) {
                int N_1 = Integer.parseInt(st.nextToken());
                deque.addFirst(N_1);
            } else if (X== 2) {
                int N_2 = Integer.parseInt(st.nextToken());
                deque.addLast(N_2);
            } else if (X==3) {
                if (!deque.isEmpty()) {
                    bw.write(deque.pollFirst() + "\n");
                } else {
                    bw.write("-1\n");
                }
            } else if (X==4) {
                if (!deque.isEmpty()) {
                    bw.write(deque.pollLast() + "\n");
                } else {
                    bw.write("-1\n");
                }
            } else if (X==5) {
                bw.write(deque.size() + "\n");
            }  else if (X==6) {
                if (deque.isEmpty()) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            }
            else if (X ==7) {
                if (!deque.isEmpty()) {
                    bw.write(deque.peekFirst() + "\n");
                } else {
                    bw.write("-1\n");
                }
            }
            else if (X ==8) {
                if (!deque.isEmpty()) {
                    bw.write(deque.peekLast() + "\n");
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

