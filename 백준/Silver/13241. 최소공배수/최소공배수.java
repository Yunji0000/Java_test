import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B =Long.parseLong(st.nextToken());

        if(A==B){
            bw.write(String.valueOf(A));
        }else {
            long max=Math.max(A, B);
            long min =Math.min(A, B);

            if (max%min==0) {
                bw.write(String.valueOf(max));
            } else {
                long i = max;
                while (true) {
                    if (i%min==0) {
                        bw.write(String.valueOf(i));
                        
                        break;
                    }
                    i+=max;
                }
            }
        }


        br.close();
        bw.flush();
        bw.close();

    }
}
