import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        int[] sort = new int[N];

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {

            arr[i]=sort[i] =Integer.parseInt(st.nextToken());

        }

        Arrays.sort(sort);


        int rank=0;
        for(int v : sort) {
            if(!hashMap.containsKey(v)) {
                hashMap.put(v, rank++);
            }
        }

        for(int i = 0; i < N; i++) {
            bw.write(hashMap.get(arr[i])+ " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
