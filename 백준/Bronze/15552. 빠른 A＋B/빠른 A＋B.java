import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++) {
            String[] str = br.readLine().split(" ");    // 한 줄을 공백으로 분리
            int A = Integer.parseInt(str[0]);    // 첫 번째 숫자
            int B = Integer.parseInt(str[1]);    // 두 번째 숫자
            
            bw.write(A + B + "\n");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}
