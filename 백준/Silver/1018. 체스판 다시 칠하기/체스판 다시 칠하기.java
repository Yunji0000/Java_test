import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());

        char[][] board = new char[N][M];
        char[][] WB = {
                {'W','B','W','B','W','B','W','B'},
                {'B','W','B','W','B','W','B','W'},
                {'W','B','W','B','W','B','W','B'},
                {'B','W','B','W','B','W','B','W'},
                {'W','B','W','B','W','B','W','B'},
                {'B','W','B','W','B','W','B','W'},
                {'W','B','W','B','W','B','W','B'},
                {'B','W','B','W','B','W','B','W'}
        };

        char[][] BW = {
                {'B','W','B','W','B','W','B','W'},
                {'W','B','W','B','W','B','W','B'},
                {'B','W','B','W','B','W','B','W'},
                {'W','B','W','B','W','B','W','B'},
                {'B','W','B','W','B','W','B','W'},
                {'W','B','W','B','W','B','W','B'},
                {'B','W','B','W','B','W','B','W'},
                {'W','B','W','B','W','B','W','B'}
        };

        for (int i = 0; i < N; i++) {
            String a=br.readLine();
            for (int j = 0; j < M; j++) {
                board[i][j]=a.charAt(j);
            }
        }


//        int count_WB =0;
//        int count_BW=0;

        int result=64;

        for (int i = 0; i <=N-8; i++) {
            for (int j = 0; j <=M-8; j++) {

                int count_WB =0;
                int count_BW=0;

                for (int x = 0; x < 8; x++) {
                    for (int y = 0; y < 8; y++) {

                        if (board[i+x][j+y] != WB[x][y]) {
                            count_WB++;
                        }
                        if (board[i+x][j+y] !=BW[x][y]) {
                            count_BW++;
                        }
                    }
                }


                int min_count = Math.min(count_WB,count_BW);
                result = Math.min(min_count,result);
            }
        }


        bw.write(String.valueOf(result));
        br.close();
        bw.flush();
        bw.close();
    }
}
