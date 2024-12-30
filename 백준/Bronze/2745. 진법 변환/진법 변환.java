import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        
        int result = 0;
        int len = N.length();
        
        for(int i=0; i<len; i++) {
            char ch = N.charAt(i);
            int num;
            
            if(ch>='0' && ch<='9') {
                num = ch - '0';
            } else {
                num = ch - 'A' + 10;
            }
            
            result += num * Math.pow(B,len-1-i);
        }
        
        bw.write(String.valueOf(result));
        
        bw.flush();
        bw.close();
        br.close();
    }
}
