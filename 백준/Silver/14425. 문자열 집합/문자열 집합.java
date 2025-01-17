import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st =new StringTokenizer(br.readLine());
        int N =Integer.parseInt(st.nextToken());
        int M =Integer.parseInt(st.nextToken());

        HashMap<String, Integer> hashMap = new HashMap<>();
        int count=0;

        for (int i = 0; i < N; i++) {
            hashMap.put(br.readLine(), 1);
        }

        for (int i = 0; i < M; i++) {
            if (hashMap.containsKey(br.readLine())) {
                count++;
            }
        }

        bw.write(String.valueOf(count));

        br.close();
        bw.flush();
        bw.close();
    }
}
