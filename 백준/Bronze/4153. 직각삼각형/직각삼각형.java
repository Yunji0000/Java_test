import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a==0 && b==0 && c==0){
                break;
            }

            int max = Math.max(Math.max(a, b), c);

            if(max == a) {
                if(b*b + c*c == a*a) {
                    bw.write("right\n");
                }
                else {
                    bw.write("wrong\n");
                }
            }
            else if(max == b) {
                if(a*a + c*c == b*b) {
                    bw.write("right\n");
                }
                else{
                    bw.write("wrong\n");
                }
            }
            else {
                if(a*a + b*b == c*c) {
                    bw.write("right\n");
                }
                else {
                    bw.write("wrong\n");
                }
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
