import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String N = br.readLine();

        int count=0;
        for(int i=0; i<N.length(); i++){
            if(i<N.length()-1){
                String two = N.substring(i,i+2);

                if(two.equals("c=") || two.equals("c-") || two.equals("d-") || two.equals("lj") || two.equals("nj") || two.equals("s=") || two.equals("z=")) {
                    count++;
                    i++;
                    continue;
                }

            }
            if(i < N.length() - 2) {
                String three = N.substring(i,i+3);

                if(three.equals("dz=")) {
                    count++;
                    i+=2;
                    continue;
                }
            }

            count++;
        }

        bw.write(String.valueOf(count));

        br.close();
        bw.flush();
        bw.close();
    }
}

