import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st =new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st=new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int up=(a*d)+(b*c);
        int down=b*d;

        int num1=up;
        int num2=down;

        while (num2 !=0){
            int a_ =num1%num2;
            num1=num2;
            num2= a_;
        }

        int gcd=num1;

        up /=gcd;
        down /=gcd;

        bw.write(up+" "+down);

        br.close();
        bw.flush();
        bw.close();

    }
}
