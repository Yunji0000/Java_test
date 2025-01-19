import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] =Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int total=arr[N-1]-arr[0];
        int gcd=0;
        for(int i = 1; i < N; i++) {
            int dis=arr[i] - arr[i-1];

            int num1 = dis;
            int num2 = gcd;
            while(num2 != 0) {
                int r=num1%num2;
                num1=num2;
                num2=r;
            }
            gcd=num1;
        }

        int result = (total/gcd)+1-N;

        bw.write(String.valueOf(result));

        br.close();
        bw.flush();
        bw.close();
    }
}
