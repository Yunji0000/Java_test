import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String word = br.readLine();
        

        int num = word.length();
        
        bw.write(String.valueOf(num));
        
        br.close();
        bw.flush();
        bw.close();
        
        
    }
}