import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        TreeMap<Integer, String> map = new TreeMap<>();

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age =Integer.parseInt(st.nextToken());
            String name=st.nextToken();

            map.put(age*100000+i, name);
        }


        for(int key : map.keySet()) {
            int age = key/100000; 
            String name = map.get(key);
            bw.write(age+ " " + name + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
