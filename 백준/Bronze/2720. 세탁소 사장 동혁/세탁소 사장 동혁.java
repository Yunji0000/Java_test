import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            int C = Integer.parseInt(br.readLine());

            int q = C / 25;
            C = C % 25;

            int d = C / 10;
            C = C % 10;

            int n = C / 5;
            C = C % 5;

            int p = C / 1;

            bw.write(q + " " + d + " " + n + " " + p + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
