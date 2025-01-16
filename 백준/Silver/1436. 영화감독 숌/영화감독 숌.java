import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N =Integer.parseInt(br.readLine());
        int num=666;
        int count=1;

        while(count!= N) {
            num++;
            if(String.valueOf(num).indexOf("666")>=0) {
                count++;
            }
        }

        System.out.println(num);
        br.close();
    }
}
