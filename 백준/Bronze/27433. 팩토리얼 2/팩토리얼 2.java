import java.io.*;
import java.util.*;

public class Main {
    public static long fact(int n) {
        if(n <= 1) {
            return 1;
        }
        else {
            return fact(n-1) * n;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(fact(N)));

        br.close();
        bw.flush();
        bw.close();
    }
}
