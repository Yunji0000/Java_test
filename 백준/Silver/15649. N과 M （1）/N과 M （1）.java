import java.io.*;
import java.util.*;

public class Main{
    static int N, M;
    static boolean[] chk;

    public static void recur(int num, Deque<Integer> deque, BufferedWriter bw) throws IOException {
        if (num==M) {
            for(int i = 0; i < M; i++) {
                bw.write(deque.toArray()[i]+" ");
            }
            bw.write("\n");
            
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!chk[i]) {
                chk[i]=true;
                deque.addLast(i);
                recur(num+1,deque, bw);
                chk[i]=false;
                deque.removeLast();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        chk = new boolean[N+1];

        Deque<Integer> deque =new ArrayDeque<>();

        recur(0, deque,bw);

        
        br.close();
        bw.flush();
        bw.close();
    }
}
