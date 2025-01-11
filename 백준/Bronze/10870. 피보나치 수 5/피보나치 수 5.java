import java.io.*;
import java.util.*;

public class Main{
    public static int fibo(int a){
        if(a<=0){
            return 0;
        } else if (a==1) {
            return 1;
            
        }
        else{
            return fibo(a-1) + fibo(a-2);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n=Integer.parseInt(br.readLine());
        
        bw.write(String.valueOf(fibo(n)));
        
        br.close();
        bw.flush();
        bw.close();
    }
}
