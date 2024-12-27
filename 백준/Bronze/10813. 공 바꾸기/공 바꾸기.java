import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[N+1];
        
        for(int i=1; i<=N; i++) {
            arr[i] = i;
        }
        
        for(int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            
            int ch_i = Integer.parseInt(st.nextToken());
            int ch_j = Integer.parseInt(st.nextToken());
            
            int temp = arr[ch_i];
            arr[ch_i] = arr[ch_j];
            arr[ch_j] = temp;
            }
        
       for(int i=1; i<=N; i++) {
            bw.write(arr[i] + " ");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}
            
            
            