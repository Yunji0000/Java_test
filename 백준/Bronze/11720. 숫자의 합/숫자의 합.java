import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        String num = br.readLine();
        int sum=0;
        
        for(int i=0; i<N; i++){
            String one = num.substring(i,i+1);
            
            sum += Integer.parseInt(one);
        }
        
        bw.write(String.valueOf(sum));
        
        br.close();
        bw.flush();
        bw.close();
    }
}