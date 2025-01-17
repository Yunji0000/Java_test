import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map=new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            String key = st.nextToken();
            map.put(key, 0);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            String key = st.nextToken();
            if(map.containsKey(key)){
                bw.write("1 ");
            }else{
                bw.write("0 ");
            }

        }

        br.close();
        bw.flush();
        bw.close();
    }
}

