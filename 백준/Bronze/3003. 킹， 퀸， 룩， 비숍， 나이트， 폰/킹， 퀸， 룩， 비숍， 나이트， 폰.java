//체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성

import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());



        int[] chess = {1, 1, 2, 2, 2, 8};

        for(int i=0; i<6; i++){
            int pin = Integer.parseInt(st.nextToken());
            int result = chess[i] - pin;

            bw.write(result + " ");

        }

        br.close();
        bw.flush();
        bw.close();

    }
}