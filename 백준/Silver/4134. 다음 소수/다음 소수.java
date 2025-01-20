import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            long n = Long.parseLong(br.readLine());

            if (n<=2) {
                bw.write("2\n");
                continue;
            }

            while (true) {
                if (isPrime(n)) {
                    bw.write(n + "\n");
                    break;
                }
                n++;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    private static boolean isPrime(long n) {
        if (n<=1) {
            return false;
        }
        if (n==2) {
            return true;
        }
        if (n%2== 0) {
            return false;
        }

        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            if (n%i== 0) {
                return false;
            }
        }
        return true;
    }
}
