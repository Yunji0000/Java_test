import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] bo=new boolean[246913];
        bo[0]=true;
        bo[1]=true;


        for(int i = 2; i * i <=246912; i++) {
            if(!bo[i]) {
                for(int j = i * i; j <= 246912; j += i) {
                    bo[j]=true;
                }
            }
        }

        while(true) {
            int n =Integer.parseInt(br.readLine());
            if(n==0) {
                break;
            }

            int count=0;
            for(int i = n+1; i <=2*n; i++) {
                if(!bo[i]) {
                    count++;
                }
            }

            bw.write(count+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
