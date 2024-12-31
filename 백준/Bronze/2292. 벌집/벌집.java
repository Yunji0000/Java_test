import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());


        int a = 1;
        int b= 6;
        int count = 1;
        while (a<N){
            a+= b;
            b += 6;
            count++;
        }

        bw.write(String.valueOf(count));

        bw.flush();
        bw.close();
        br.close();

    }
}
