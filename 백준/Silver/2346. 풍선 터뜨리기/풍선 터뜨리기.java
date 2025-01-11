import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st =new StringTokenizer(br.readLine());

        Deque<Integer> deque_1=new ArrayDeque<>(); //num
        Deque<Integer> deque_2=new ArrayDeque<>(); // 인덱스자리

        for (int i = 1; i <= N; i++) {
            deque_1.add(Integer.parseInt(st.nextToken()));
            deque_2.add(i);
        }

        while (!deque_1.isEmpty()) {
            int move = deque_1.pollFirst();

            bw.write(deque_2.pollFirst() + " ");


            if(deque_1.isEmpty()) {
                break;
            }

            if (move > 0) { //+
                for (int i = 0; i < move-1; i++) {
                    deque_1.addLast(deque_1.pollFirst());
                    deque_2.addLast(deque_2.pollFirst());
                }
            } else { //-
                for (int i = 0; i < Math.abs(move); i++) {
                    deque_1.addFirst(deque_1.pollLast());
                    deque_2.addFirst(deque_2.pollLast());
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
