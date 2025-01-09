import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N=Integer.parseInt(br.readLine());


        Deque<Integer> que =new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            que.add(i);
        }
            while (que.size() >1){
                que.poll();
                que.add(que.poll());

            }

            bw.write(String.valueOf(que.peek()));


        br.close();
        bw.flush();
        bw.close();

    }
}
