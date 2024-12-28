import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        //String a = br.readLine();
        
        while (br.ready()) {
            bw.write(br.readLine() + "\n");
        }
        
        br.close();
        bw.flush();
        bw.close();

    }
}