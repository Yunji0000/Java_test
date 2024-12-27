import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(br.readLine());
        
        
        
        int count = 0;
        for(int i=0; i<N; i++){
            if(Integer.parseInt(st.nextToken()) == V){
                count++;
            }
        }
        
        bw.write(String.valueOf(count));
        
        br.close();
        bw.flush();
        br.close();
    }
}