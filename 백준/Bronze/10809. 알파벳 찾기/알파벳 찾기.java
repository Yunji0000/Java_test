import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String S = br.readLine();
        
        for(char i='a'; i<='z'; i++){
            bw.write(String.valueOf(S.indexOf(i)) + " ");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}