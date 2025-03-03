import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        TreeMap<String,Integer> treeMap =new TreeMap<>((s1,s2)->{
            if (s1.length()==s2.length()) {
                return s1.compareTo(s2);
            }
            return s1.length()-s2.length();
        });

        for (int i = 0; i < N; i++) {
            String word=br.readLine();
            treeMap.put(word,0);

        }

        for (String word : treeMap.keySet()) {
            bw.write(word + "\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
