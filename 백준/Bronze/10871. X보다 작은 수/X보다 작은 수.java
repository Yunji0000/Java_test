import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        
        
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        for(int i=0; i<N; i++){
            if(arr[i] < X){
                bw.write(arr[i] + "\n");
            }
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}